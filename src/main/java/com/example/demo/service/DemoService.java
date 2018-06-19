package com.example.demo.service;

import com.example.demo.bean.DemoData;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 上午11:30
 * @Description:
 */
public interface DemoService {


    /**
     * 查询mongodb数据
     * @return
     */
    DemoData getMongodbData();
}
