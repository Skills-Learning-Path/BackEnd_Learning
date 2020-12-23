package com.test.library.service;

import com.alibaba.fastjson.JSONObject;
import com.test.library.mapper.UserMapper;
import com.test.library.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
//    @PostMapping("/user")
    public String add(User user){
        int status = userMapper.insert(user);
        JSONObject result = new JSONObject(true);
        result.put("data",user);
        result.put("status",status);
        return result.toString();
    }
//    @GetMapping("/user")
    public String query(){
        List<User> users = userMapper.selectList(null);
        return JSONObject.toJSONString(users);
    }
//    @PutMapping("/user")
    public String update(User user){
        int status = userMapper.updateById(user);
        JSONObject result = new JSONObject(true);
        result.put("data",user);
        result.put("status",status);
        return result.toString();
    }
//    @DeleteMapping("/user/{id}")
    public String delete(@PathVariable int id){
        int status = userMapper.deleteById(id);
        JSONObject result = new JSONObject(true);
        result.put("status",status);
        return result.toString();
    }
}
