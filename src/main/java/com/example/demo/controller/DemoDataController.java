package com.example.demo.controller;

import com.example.demo.enums.RespEnum;
import com.nfsq.platform.utils.common.JsonResult;
import com.example.demo.bean.DemoData;
import com.example.demo.service.DemoDataService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Author: Jfwang001
 * @Date: 2018/5/8 下午5:28
 * @Description:
 */
@RestController
@RequestMapping(value = "/demoData")
public class DemoDataController {

    @Autowired
    private DemoDataService demoDataService;

    private static final Logger logger = LoggerFactory.getLogger(DemoDataController.class);

    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public JsonResult add(@RequestParam("id") int id, @RequestParam("context") String context, @RequestParam("modifyDate") String modifyDate){
        DemoData demoData = new DemoData();
        demoData.setId(id);
        demoData.setContext(context);
        demoData.setModifyDate(modifyDate);
        JsonResult jsonResult = new JsonResult();
        try {
            demoDataService.insert(demoData);
            jsonResult.setCode(RespEnum.SUCCESS.getCode());
            jsonResult.setMsg(RespEnum.SUCCESS.getValue());
            jsonResult.setSuccess(Boolean.TRUE);
        }catch (Exception e){
            e.printStackTrace();
            logger.error("id," +id,e);
            jsonResult.setSuccess(Boolean.FALSE);
        }
        return jsonResult;
    }

    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public JsonResult update(@RequestParam("id") int id,@RequestParam("context") String context ,@RequestParam("modifyDate") String modifyDate){
        DemoData demoData = new DemoData();
        demoData.setId(id);
        demoData.setContext(context);
        demoData.setModifyDate(modifyDate);
        JsonResult jsonResult = new JsonResult();
        try {
            demoDataService.update(demoData);
            jsonResult.setCode(RespEnum.SUCCESS.getCode());
            jsonResult.setMsg(RespEnum.SUCCESS.getValue());
            jsonResult.setSuccess(Boolean.TRUE);
        }catch (Exception e){
            jsonResult.setCode(RespEnum.UNKNOWN_ERROR.getCode());
            jsonResult.setMsg(RespEnum.UNKNOWN_ERROR.getValue());
            jsonResult.setSuccess(Boolean.FALSE);
        }
        return jsonResult;
    }

    @RequestMapping(value = "/get",method = RequestMethod.GET)
    public JsonResult findById(@RequestParam(value = "id") int id){
        logger.info("id," +id);
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(demoDataService.getContext(id));
        return jsonResult;
    }

    @RequestMapping(value = "/find",method = RequestMethod.GET)
    public JsonResult findAll(){
        JsonResult jsonResult = new JsonResult();
        jsonResult.setData(demoDataService.findALL());
        return jsonResult;
    }

    @RequestMapping(value = "/findLike",method = RequestMethod.POST)
    public JsonResult findLike(@RequestParam(value = "context") String context){
        JsonResult jsonResult =  new JsonResult();
        jsonResult.setData(demoDataService.findByLike(context));
        return jsonResult;
    }
}
