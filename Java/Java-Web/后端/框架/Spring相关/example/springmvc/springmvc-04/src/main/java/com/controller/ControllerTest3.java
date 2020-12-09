package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest3 {
    @RequestMapping("/t3")
    public String test(){
        return "test";
    }
}
