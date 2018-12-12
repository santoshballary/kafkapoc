package com.itc.kafkaproducer.writer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itc.kafkaproducer.model.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;

/**
 * Created by hexad3cimal on 9/12/18.
 */

public class Sender {
    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;
    private static Gson gson = new GsonBuilder().create();

    public void send(Test test)throws Exception{
        kafkaTemplate.send("test2",gson.toJson(test));
    }
}
