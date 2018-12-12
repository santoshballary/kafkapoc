package com.itc.consumer.feignclients;

import com.itc.consumer.models.Test;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


/**
 * Created by anon on 15/3/18.
 */
@FeignClient(name="subject-client",url="http://localhost:8090")
public interface TestClient {

    @PostMapping("/db/")
    ResponseEntity<Test> post(@RequestBody Test test)throws Exception;

}
