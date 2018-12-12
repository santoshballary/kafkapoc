package com.itc.dbservice.services;

import com.itc.dbservice.models.Test;
import com.itc.dbservice.repository.TestDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hexad3cimal on 10/12/18.
 */

@Service("TestService")
@Transactional
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public Test getTestById(String testId) throws Exception {
        return testDao.getTestById(testId);
    }
}
