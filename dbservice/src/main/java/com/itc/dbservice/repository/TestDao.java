package com.itc.dbservice.repository;

import com.itc.dbservice.models.Test;

/**
 * Created by hexad3cimal on 10/12/18.
 */
public interface TestDao {

    Test getTestById(String testId)throws Exception;

}
