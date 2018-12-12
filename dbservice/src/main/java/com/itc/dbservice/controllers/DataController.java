package com.itc.dbservice.controllers;

import com.itc.dbservice.models.Test;
import com.itc.dbservice.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * Created by hexad3cimal on 10/12/18.
 */

@RestController
public class DataController {

    @Autowired
    private TestService testService;

    @PostMapping("/")
    public void processData(@RequestBody Test test)throws Exception{
        Test test1 = testService.getTestById(test.getDress_id());
        if(Objects.nonNull(test1))
            System.out.println("test = [" + test1.getSeason() + "]");
    }
}
