package com.controller;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pojo.User;
import com.utils.JSONUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/j1")
    public String json1() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();
        User user = new User("测试",10,"M");
        String str = mapper.writeValueAsString(user);
        return str;
    }
    @RequestMapping("/j2")
    public String json2() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        List<User> list = new ArrayList<>();
        list.add(new User("测试",10,"M"));
        list.add(new User("测试",11,"M"));
        list.add(new User("测试",12,"M"));
        return mapper.writeValueAsString(list);
    }
    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);
//        String s = sdf.format(date);
//        String str = mapper.writeValueAsString(s);
        return mapper.writeValueAsString(date);
    }
    @RequestMapping("/j4")
    public String json4(){
        Date date = new Date();
        return JSONUtils.getJson(date,"yyyy-MM-dd HH:mm:ss");
    }
    @RequestMapping("/j5")
    public String json5(){
        List<User> list = new ArrayList<>();
        list.add(new User("测试",10,"M"));
        list.add(new User("测试",11,"M"));
        list.add(new User("测试",12,"M"));
        return JSONUtils.getJson(list);
    }

    @RequestMapping("/j6")
    public String json6(){
        List<User> list = new ArrayList<>();
        list.add(new User("测试",10,"M"));
        list.add(new User("测试",11,"M"));
        list.add(new User("测试",12,"M"));
        String s = JSON.toJSONString(list);
        return s;
    }
}
