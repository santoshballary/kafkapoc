package com.itc.kafkaproducer.writer;

import com.itc.kafkaproducer.model.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by hexad3cimal on 8/12/18.
 */
public class TestItemWriter implements ItemWriter<Test> {

@Autowired
Sender sender;

    private static final String TOPIC = "test2";
    private static final Logger LOGGER = LoggerFactory.getLogger(TestItemWriter.class);

    /**
     * @see ItemWriter#write(java.util.List)
     */
    @Override
    public void write(List<? extends Test> item) throws Exception {
        item.forEach( i -> {
        try {
            sender.send(i);
        }catch (Exception e){
            e.printStackTrace();
        }
        });
    }

}