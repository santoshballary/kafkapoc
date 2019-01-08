package com.itc.dbservice.services;

import com.itc.dbservice.models.SccVariables;

import java.util.List;

/**
 * Created by hexad3cimal on 1/3/19.
 */
public interface SccVariablesService {

    List<SccVariables> getSccVariablesList()throws Exception;

}
