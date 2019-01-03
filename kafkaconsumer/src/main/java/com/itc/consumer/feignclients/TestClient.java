package com.itc.consumer.feignclients;

import com.itc.consumer.models.Record;
import com.itc.consumer.models.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Created by anon on 15/3/18.
 */
@FeignClient(name="record-client",url="http://localhost:8090")
public interface TestClient {

    @PostMapping("/db/")
    ResponseEntity<Record> post(@RequestBody Record record)throws Exception;

}
