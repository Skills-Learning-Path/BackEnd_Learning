package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class RestFulController {
    //普通方式
    @RequestMapping("/add")
    public String test1(int a, int b, Model model){
        int res=a+b;
        model.addAttribute("msg",res);
        return "test";
    }

    //RestFul方式
//    @RequestMapping(value = "/add2/{a}/{b}",method = RequestMethod.POST)
    @PostMapping("/add2/{a}/{b}")
    public String test2(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg",res+"---1");
        return "test";
    }
    @GetMapping("/add2/{a}/{b}")
    public String test3(@PathVariable int a, @PathVariable int b, Model model){
        int res=a+b;
        model.addAttribute("msg",res+"---2");
        return "test";
    }
}
