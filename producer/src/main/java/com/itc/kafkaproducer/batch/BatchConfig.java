package com.itc.kafkaproducer.batch;

import com.itc.kafkaproducer.listener.JobCompletionNotification;
import com.itc.kafkaproducer.model.Test;
import com.itc.kafkaproducer.processor.FileProcessor;
import com.itc.kafkaproducer.writer.TestItemWriter;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

/**
 * Created by hexad3cimal on 7/12/18.
 */

@Configuration
@EnableBatchProcessing
public class BatchConfig  extends DefaultBatchConfigurer{

    @Autowired
    private JobBuilderFactory jobBuilderFactory;

    @Autowired
    private StepBuilderFactory stepBuilderFactory;

    @Bean
    public FileProcessor processor() {
        return new FileProcessor();
    }

    @Bean
    public FlatFileItemReader<Test> reader(){
        FlatFileItemReader<Test> reader = new FlatFileItemReader<Test>();
        reader.setResource(new ClassPathResource("data.csv"));
        reader.setLineMapper(new DefaultLineMapper<Test>() {{
            setLineTokenizer(new DelimitedLineTokenizer() {{
                setNames(new String[] {"Dress_ID", "Price", "Rating", "Size","Season", "NeckLine", "SleeveLength"});
            }});
            setFieldSetMapper(new BeanWrapperFieldSetMapper<Test>() {{
                setTargetType(Test.class);
            }});
        }});
        return reader;
    }


    @Bean
    public Job importUserJob(JobCompletionNotification listener) {
        return jobBuilderFactory.get("importUserJob")
                .incrementer(new RunIdIncrementer())
                .listener(listener)
                .flow(step1())
                .end()
                .build();

    }

    @Override
    public void setDataSource(DataSource dataSource) {
        //This BatchConfigurer ignores any DataSource
    }

    @Bean
    public TestItemWriter writer(){
        TestItemWriter writer = new TestItemWriter();
        return writer;
    }

    @Bean
    public Step step1() {
        return stepBuilderFactory.get("step1")
                .<Test, Test> chunk(10)
                .reader(reader())
                .writer(writer())
                .build();

    }

}
