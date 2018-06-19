package com.example.demo.bean;

import io.swagger.models.auth.In;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 上午11:12
 * @Description:
 */
@Document(collection = "demoData")
public class DemoData implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer id;

    private String context;

    private String modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(String modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Override
    public String toString() {
        return "DemoData{" +
                "id=" + id +
                ", context='" + context + '\'' +
                ", modifyDate='" + modifyDate + '\'' +
                '}';
    }
}
