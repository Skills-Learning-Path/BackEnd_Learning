package com.test.library.controller;

import com.test.library.pojo.User;
import com.test.library.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(produces = "application/json;charset=UTF-8")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/register")
    public String register(User user){
        return userService.add(user);
    }
}
