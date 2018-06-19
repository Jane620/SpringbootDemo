package com.example.demo.service.impl;

import com.example.demo.bean.DemoData;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 上午11:13
 * @Description:
 */

@Service
public class DemoServiceImpl implements DemoService{

    @Override
    public DemoData getMongodbData(){
        DemoData demoData = new DemoData();
        demoData.setId(1);
        return demoData;
    }

}
