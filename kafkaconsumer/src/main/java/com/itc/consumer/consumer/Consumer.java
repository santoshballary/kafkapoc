package com.itc.consumer.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itc.consumer.feignclients.TestClient;
import com.itc.consumer.models.Record;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class Consumer {


    @Autowired
    private TestClient testClient;

    @KafkaListener(topics = {"test2"})
    public void listen(ConsumerRecord<?, ?> record)throws Exception{

        Optional<?> kafkaMessage = Optional.ofNullable(record.value());
        ObjectMapper mapper = new ObjectMapper();

        if (kafkaMessage.isPresent()) {

            Object message = kafkaMessage.get();
            Record r =  mapper.readValue(message.toString()
                    .replace("Struct","").replaceAll("}","\"}")
                    .replaceAll("\\{","{\"")
                    .replaceAll("=","\"=\"")
                    .replaceAll(",","\",\"")
                    .replaceAll("=",":"), Record.class);
            System.out.println("record = [" + r.toString() + "]");
            testClient.post(r);
        }

    }
}
