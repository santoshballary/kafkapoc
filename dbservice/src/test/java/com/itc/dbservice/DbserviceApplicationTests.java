package com.itc.dbservice;

import com.itc.dbservice.dto.CodsusAndCustomerId;
import com.itc.dbservice.repository.FetchFunctionsDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DbserviceApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private FetchFunctionsDao fetchFunctionsDao;

	@Test
	public void fetchFunctionsDaoTest() throws Exception{

        List<CodsusAndCustomerId> c =fetchFunctionsDao.getCodsusAndCustomerId("0015","0075","300","0025931");
        Assert.assertNotNull(c);
    }

}
