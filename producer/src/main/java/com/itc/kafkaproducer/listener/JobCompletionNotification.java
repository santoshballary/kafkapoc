package com.itc.kafkaproducer.listener;

/**
 * Created by hexad3cimal on 8/12/18.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.listener.JobExecutionListenerSupport;
import org.springframework.stereotype.Component;


@Component
public class JobCompletionNotification extends JobExecutionListenerSupport{

    private static final Logger log = LoggerFactory.getLogger(JobCompletionNotification.class);






    @Override
    public void afterJob(JobExecution jobExecution) {
        if(jobExecution.getStatus() == BatchStatus.COMPLETED) {
            log.info("Job is Completed, Time to verify your results");

        }

    }

}