package com.itc.consumer.consumer;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.itc.consumer.feignclients.TestClient;
import com.itc.consumer.models.Test;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Consumer {

    private static Gson gson = new GsonBuilder().create();

    @Autowired
    private TestClient testClient;

    @KafkaListener(topics = {"test2"})
    public void listen(ConsumerRecord<?, ?> record)throws Exception{

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();
            System.out.println("---->"+message);
            Test test = gson.fromJson(message.toString(), Test.class);
            testClient.post(test);
        }

    }
}
