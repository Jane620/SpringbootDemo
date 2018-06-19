package com.example.demo.service.impl;

import com.example.demo.bean.DemoData;
import com.example.demo.service.DemoDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 下午5:09
 * @Description:
 */
@Service
public class DemoDataServiceImpl implements DemoDataService {

    @Autowired
    private MongoTemplate mongoTemplate;


    @Override
    public DemoData getContext(Integer id) {
        DemoData demoData = null;
        try {
            Query query = new Query(Criteria.where("id").is(id));
            demoData = mongoTemplate.findOne(query,DemoData.class);

        }catch (Exception e){
            e.printStackTrace();
        }
        return demoData;
    }

    @Override
    public void insert(DemoData demoData) {
        //判断是否存
        if (demoData != null){
            int id = demoData.getId();
            mongoTemplate.insert(demoData);
        }

    }

    @Override
    public void update(DemoData demoData) {
        Criteria criteria = Criteria.where("id").is(demoData.getId());
        Query query = new Query(criteria);
        Update update = Update.update("context",demoData.getContext()).set("modifyDate",demoData.getModifyDate());
        mongoTemplate.updateMulti(query,update,DemoData.class);
    }

    @Override
    public List<DemoData> findALL() {
        List<DemoData> demoData_list = new ArrayList<>();
        demoData_list = mongoTemplate.findAll(DemoData.class);
        return demoData_list;
    }

    @Override
    public List<DemoData> findByLike(String reg) {
        Criteria criteria = new Criteria();
        List<DemoData> demoData = mongoTemplate.find(new Query(criteria.orOperator(
                Criteria.where("context").regex(reg),
                Criteria.where("modifyDate").regex(reg)
        )),DemoData.class);
        return demoData;
    }
}
