package com.example.demo.service;

import com.example.demo.bean.DemoData;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Random;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/10 下午4:30
 * @Description:
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class DemoDataServiceTest{

    @Autowired
    private DemoDataService demoDataService;

    @Autowired
    private MongoTemplate mongoTemplate;

    @Test
    public void insetTest(){
        DemoData demoData = new DemoData();
        Random random = new Random(100);
        int id = random.nextInt();
        demoData.setId(id);
        demoData.setContext("test"+id);
        demoData.setModifyDate("2017-10");
        demoDataService.insert(demoData);
        String context = demoDataService.getContext(id).getContext();
        Assert.assertEquals("test"+id,context);
    }


}
