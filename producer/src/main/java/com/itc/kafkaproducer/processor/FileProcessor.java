package com.itc.kafkaproducer.processor;

import com.itc.kafkaproducer.model.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

/**
 * Created by hexad3cimal on 8/12/18.
 */
public class FileProcessor  implements ItemProcessor<Test, Test> {

    private static final Logger log = LoggerFactory.getLogger(FileProcessor.class);

    @Override
    public Test process(final Test test) throws Exception {
//        final String firstName = person.getFirtName().toUpperCase();
//        final String lastName = person.getLastName().toUpperCase();
//
//        final Person transformedPerson = new Person(firstName, lastName, person.getEmail(), person.getAge());
//
//        log.info("Converting (" + person + ") into (" + transformedPerson + ")" ) ;
        return null;
    }
    }