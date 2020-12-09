package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/e")
public class EncodingController {
    @PostMapping("/t1")
    public String test1(String name, Model model){
        model.addAttribute("msg",name);
        return "test";
    }
}
