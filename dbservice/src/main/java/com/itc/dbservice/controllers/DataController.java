package com.itc.dbservice.controllers;

import com.itc.dbservice.models.Record;
import com.itc.dbservice.services.SccVariablesService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


/**
 * Created by hexad3cimal on 10/12/18.
 */

@RestController
public class DataController {

    @Autowired
    private SccVariablesService sccVariablesService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DataController.class);

    @PostMapping("/")
    public void processData(@RequestBody Record record)throws Exception{
        LOGGER.info("record : "+record.toString());
        sccVariablesService.getSccVariablesList().forEach(sccVariables -> { LOGGER.info(sccVariables.toString());});
        String c = record.getCompany()+record.getCentercode()
                +record.getProductcode()+record.getContractid()+"000000081"+"F"
                +"customer no"+"G0319_NORDEVAR"+"Codsus"+"G0319_NOMBRVAR"+record.getFlag1()+record.getFee()+"Cuentalocal14"+
                new Date()+"nombrecompleto"+record.getProductname();

    }
}
