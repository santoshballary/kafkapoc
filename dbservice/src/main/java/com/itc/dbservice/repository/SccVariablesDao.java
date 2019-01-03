package com.itc.dbservice.repository;


import com.itc.dbservice.models.SccVariables;

import java.util.Collection;

/**
 * Created by hexad3cimal on 1/3/19.
 */
public interface SccVariablesDao {

    Collection<SccVariables> getSccVariablesList()throws Exception;
}
