package com.example.demo.service;

import com.example.demo.bean.DemoData;

import java.util.List;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 下午5:12
 * @Description:
 */
public interface DemoDataService {

    //List<DemoData> findAll();

    List<DemoData> findALL();

    DemoData getContext(Integer id);

    void insert(DemoData demoData);

    void update(DemoData demoData);

    List<DemoData> findByLike(String reg);

    //void delete(DemoData demoData);
}
