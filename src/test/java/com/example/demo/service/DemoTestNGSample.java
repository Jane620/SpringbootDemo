package com.example.demo.service;

import com.example.demo.bean.DemoData;
import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.List;

/**
 * @Author: Jfwang001
 * @Date: 2018/6/1 上午10:55
 * @Description:
 */
@SpringBootTest()
public class DemoTestNGSample extends AbstractTestNGSpringContextTests {

    @Autowired
    private DemoDataService demoDataService;

    @DataProvider(name = "query")
    public Object[][] dataProvide(){

        return new Object[][]{{"2017-10","\"this is a test\""}};

    }

    @Test(groups = "query",dataProvider = "query")
    public void findByLikeTest(String match,String expect){
        List<DemoData> list_demoData = demoDataService.findByLike(match);
        String context = list_demoData.get(0).getContext();
        Assert.assertEquals(expect,context);
    }

    @Test(groups = "query")
    public void findALLTest(){

        List<DemoData> list_demoData = demoDataService.findALL();
        Assert.assertEquals(11,list_demoData.size()+1);

    }

    @Test(groups = "insert")
    public void insertTest(){
        DemoData demoData = new DemoData();
        demoData.setId(101);
        demoData.setContext("222");
        demoData.setModifyDate("2018-06-01");
        try {
            demoDataService.insert(demoData);
        }catch (Exception e){
            e.printStackTrace();
            Assert.fail("fail");
        }
        Assert.assertTrue("true",Boolean.TRUE);
    }

}
