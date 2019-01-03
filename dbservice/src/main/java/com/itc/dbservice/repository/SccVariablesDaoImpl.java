package com.itc.dbservice.repository;

import com.itc.dbservice.models.SccVariables;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.Collection;

/**
 * Created by hexad3cimal on 1/3/19.
 */

@Repository("SccVariablesDao")
public class SccVariablesDaoImpl implements SccVariablesDao {

    @Autowired
    private EntityManager em;

    @Override
    public Collection<SccVariables> getSccVariablesList() throws Exception {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<SccVariables> cq = cb.createQuery(SccVariables.class);
        Root<SccVariables> sccVariables = cq.from(SccVariables.class);
        Predicate sccVariablePredicate = cb.equal(sccVariables.get("G0319_TIPCOVAR"), "000000081");
        cq.where(sccVariablePredicate);
        TypedQuery<SccVariables> query = em.createQuery(cq);
        return query.getResultList();
    }



}
