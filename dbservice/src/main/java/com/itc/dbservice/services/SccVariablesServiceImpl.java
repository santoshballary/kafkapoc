package com.itc.dbservice.services;

import com.itc.dbservice.models.SccVariables;
import com.itc.dbservice.repository.SccVariablesDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

/**
 * Created by hexad3cimal on 1/3/19.
 */

@Service
@Transactional
public class SccVariablesServiceImpl implements SccVariablesService {

    @Autowired
    private SccVariablesDao sccVariablesDao;

    @Override
    public Collection<SccVariables> getSccVariablesList() throws Exception {
        return sccVariablesDao.getSccVariablesList();
    }
}
