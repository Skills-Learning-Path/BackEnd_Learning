package com.data.controller;

import com.data.mapper.UserMapper;
import com.data.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;
    @RequestMapping("/query")
    public List<User> queryUserList(){
        List<User> users = userMapper.queryUserList();
        return users;
    }
    @RequestMapping("/add")
    public int addUser(){
        return userMapper.addUser(new User(5, "abcder", "adfre"));
    }
    @RequestMapping("/update")
    public int updateUser(){
        return userMapper.updateUser(new User(5, "abcder", "111"));
    }
    @RequestMapping("/delete/{id}")
    public int deleteUser(@PathVariable("id") int id){
        return userMapper.deleteUser(id);
    }
}
