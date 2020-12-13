package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
    @RequestMapping("/test")
    public String index(Model model){
        model.addAttribute("msg","Hello,Thymeleaf");
        return "test";
    }
}
