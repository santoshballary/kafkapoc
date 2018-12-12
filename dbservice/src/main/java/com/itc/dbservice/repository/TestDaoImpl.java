package com.itc.dbservice.repository;

import com.itc.dbservice.models.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 * Created by hexad3cimal on 10/12/18.
 */

@Repository("TestDao")
public class TestDaoImpl implements TestDao  {

    @Autowired
    private EntityManager em;

    @Override
    public Test getTestById(String testId) throws Exception {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<Test> cq = cb.createQuery(Test.class);
        Root<Test> test = cq.from(Test.class);
        Predicate testPredicate = cb.equal(test.get("dress_id"), testId);
        cq.where(testPredicate);
        TypedQuery<Test> query = em.createQuery(cq);
        return query.getSingleResult();
    }
}
