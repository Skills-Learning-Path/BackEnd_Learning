package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelTest1 {
    @RequestMapping("/tt1")
    public String test1(Model model){
        return "forward:/index.jsp";
    }
    @RequestMapping("/tt2")
    public String test2(Model model){
        return "redirect:/index.jsp";
    }
}
