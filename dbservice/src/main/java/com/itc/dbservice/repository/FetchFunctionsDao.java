package com.itc.dbservice.repository;

import com.itc.dbservice.dto.AccountNo;
import com.itc.dbservice.dto.CodsusAndCustomerId;
import com.itc.dbservice.models.PersFisicaUk;
import com.itc.dbservice.models.SccVariables;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by hexad3cimal on 1/6/19.
 */

public interface FetchFunctionsDao extends JpaRepository<SccVariables,Long> {

    @Query("select new com.itc.dbservice.dto.CodsusAndCustomerId (p.pscCodPers, s.id.e0338Codsus) from PersContrato p, SccSuscripcion s where p.pscIdempr  = :pscIdempr and p.pscIdcent  = :pscIdcent" +
            " and p.pscIdprod  = :pscIdprod and p.pscIdcontr = :pscIdcontr" +
            " and p.pscTipoPers = s.e0338Tipopers and p.pscCodPers = s.e0338Codpers")
    List<CodsusAndCustomerId> getCodsusAndCustomerId(@Param("pscIdempr") String pscIdempr,
                                                     @Param("pscIdcent") String pscIdcent,
                                                     @Param("pscIdprod") String pscIdprod,
                                                     @Param("pscIdcontr") String pscIdcontr) throws Exception;
    @Query("select c.e1243Idctoloc from CointCtolocal c where c.id.e1243Idempr   = :e1243Idempr " +
            "and c.id.e1243Idcent   = :e1243Idcent and c.id.e1243Idprod   = :e1243Idprod " +
            "and c.id.e1243Idcontr  = :e1243Idcontr")
    List<String> getAccountNo(@Param("e1243Idempr") String e1243Idempr,
                           @Param("e1243Idcent") String e1243Idcent,
                           @Param("e1243Idprod") String e1243Idprod,
                           @Param("e1243Idcontr") String e1243Idcontr)throws Exception;

    @Query("from PersFisicaUk p where p.id.e0476CodPers   = :e0476CodPers ")
    List<PersFisicaUk> getPersFisicaUk(@Param("e0476CodPers") Integer e0476CodPers)throws Exception;
}
