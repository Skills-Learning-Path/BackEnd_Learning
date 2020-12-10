package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {
    @RequestMapping("/gologin")
    public String login(HttpSession session, String username, String password){
        session.setAttribute("userLoginInfo",username);
        return "main";
    }
    @RequestMapping("/main")
    public String main(){
        return "main";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
