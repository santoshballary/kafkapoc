package com.itc.dbservice.services;

import com.itc.dbservice.models.Test;

/**
 * Created by hexad3cimal on 10/12/18.
 */
public interface TestService {
    Test getTestById(String testId)throws Exception;

}
