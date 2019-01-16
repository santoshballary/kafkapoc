package com.itc.dbservice.controllers;

import com.itc.dbservice.dto.AccountNo;
import com.itc.dbservice.dto.CodsusAndCustomerId;
import com.itc.dbservice.models.PersFisicaUk;
import com.itc.dbservice.models.Record;
import com.itc.dbservice.models.SccVariables;
import com.itc.dbservice.repository.FetchFunctionsDao;
import com.itc.dbservice.services.SccVariablesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;


/**
 * Created by hexad3cimal on 10/12/18.
 */

@RestController
public class DataController {

    @Autowired
    private SccVariablesService sccVariablesService;

    @Autowired
    private FetchFunctionsDao fetchFunctionsDao;

    private static final Logger LOGGER = LoggerFactory.getLogger(DataController.class);

    @PostMapping("/")
    public void processData(@RequestBody Record record) throws Exception {
        //LOGGER.info("record : "+record.toString());

        List<String> recordsList = new ArrayList<>();
        SccVariables[] sccVariablesPrimitiveList = new SccVariables[10];
        sccVariablesService.getSccVariablesList().forEach( sccVariables -> {


            if(sccVariables.getG0319Nordevar() == 4){
                sccVariablesPrimitiveList[0] =sccVariables;
            }
            if(sccVariables.getG0319Nordevar() == 6){
                sccVariablesPrimitiveList[1] =sccVariables;
            }
            if(sccVariables.getG0319Nordevar() == 1){
                sccVariablesPrimitiveList[2] =sccVariables;
            }
            if(sccVariables.getG0319Nordevar() == 2){
                sccVariablesPrimitiveList[3] =sccVariables;
            }
            if(sccVariables.getG0319Nordevar() == 3){
                sccVariablesPrimitiveList[4] =sccVariables;
            }
            if(sccVariables.getG0319Nordevar() == 5){
                sccVariablesPrimitiveList[5] =sccVariables;
            }
        });

        List<SccVariables> sccVariablesList = new ArrayList<>();
        sccVariablesList = Arrays.asList(sccVariablesPrimitiveList);
        List<CodsusAndCustomerId> cc = fetchFunctionsDao.getCodsusAndCustomerId(record.getCompany(),
                record.getCentercode(), record.getProductcode(), record.getContractid());

        List<String> accNos = fetchFunctionsDao.getAccountNo(record.getCompany(),
                record.getCentercode(), record.getProductcode(), record.getContractid());
        for(int i =0;i < sccVariablesService.getSccVariablesList().size() ; i++) {
            SccVariables sccVariables = sccVariablesList.get(i);
            try {
                if (Objects.nonNull(cc) && cc.size() > 0 && Objects.nonNull(accNos) && accNos.size() > 0) {
                    List<PersFisicaUk> persFisicaUk = fetchFunctionsDao.getPersFisicaUk(cc.get(0).getPscCodPers());
                    if (Objects.nonNull(persFisicaUk) && persFisicaUk.size() > 0) {
                        PersFisicaUk p = persFisicaUk.get(0);
                        String accountNo = accNos.get(0).trim();
                        String salutation = "";
                        if(p.getE0476SexoPer().toString().trim().equalsIgnoreCase("V")){

                            salutation = "MR ";
                        }else{
                            salutation = "MRS ";
                        }
                        accountNo = addZeros(9 - accountNo.length(), accountNo);
                        StringBuilder recordString = new StringBuilder();
                        recordString.append(record.getCompany().trim()).append(record.getCentercode().trim())
                               .append(record.getProductcode().trim()).append(record.getContractid().trim()).append( "000000081F")
                               .append(addZeros(9 - cc.get(0).getPscCodPers().toString().trim().length(), cc.get(0).getPscCodPers().toString().trim())).append( "00000000")
                               .append(sccVariables.getG0319Nordevar().toString().trim())
                               .append(addZeros(15 - cc.get(0).getE0338Codsus().trim().length(), cc.get(0).getE0338Codsus().trim()))
                               .append( sccVariables.getG0319Nombrvar().trim())
                               .append(getValueAccordingtoNordeVar(sccVariables.getG0319Nordevar(), accountNo ,record.getFlag1().trim(),
                                        record.getFee().trim(),LocalDateTime.now().getMonth().toString().substring(0, 3) +
                                                " " + LocalDateTime.now().getDayOfMonth(),   salutation  +
                                        p.getE0476FirstNm() + " " + p.getE0476MiddlNm() + " "
                                                + p.getE0476LastNm()
                                        ,record.getProductname().trim()));

                        String with401Length = String.format("%-401s",recordString);

                        String finalOutputString = new StringBuffer(with401Length).replace(400,400, "Y").replace(261,270, "000000000").toString();
//
                      //  LOGGER.error("data >>>" + finalOutputString);


                        recordsList.add(finalOutputString);
                    }
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
        }


        FileWriter writer = new FileWriter("output.txt",true);
        for( String s :recordsList){
            writer.write(s);
            writer.write("\n");
        }
        writer.close();

    }

    public String getValueAccordingtoNordeVar(Integer nordeVar, String accountNo,
                                              String flag, String fee, String date,
                                              String fullName, String productName)throws Exception{
        switch (nordeVar){
            case 1:
                return "       "+accountNo;
            case 2:
                return  "         "+date;
            case 3:
                return "      "+fullName;
            case 4:
                return "              "+fee;
            case 6:
                return flag.equalsIgnoreCase("Y") ? "           "+"YES" : "           "+"NO";
            case 5:
                return "         "+productName;
            default:
                return "";
        }
//        switch (nordeVar){
//            case 1:
//                return "              "+fee;
//            case 2:
//                return flag == "Y" ? "           "+"YES" : "           "+"NO";
//            case 3:
//                return "       "+accountNo;
//            case 4:
//                return  "         "+date;
//            case 6:
//                return "      "+fullName;
//            case 5:
//                return "         "+productName;
//            default:
//                return "";
//        }

    }

    public String addZeros(Integer noOfZeros, String value){

        for(int i=0;i<noOfZeros ; i++){

            value = "0"+value;

        }

        return value;

    }
}
