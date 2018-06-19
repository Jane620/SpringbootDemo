package com.example.demo.controller;

import com.example.demo.bean.DemoData;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 上午11:32
 * @Description:
 */
@RestController
@RequestMapping("/query")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/data",method = RequestMethod.GET)
    @ResponseBody
    public DemoData getData(){
        return demoService.getMongodbData();

    }

}
