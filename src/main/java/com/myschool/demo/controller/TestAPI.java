package com.myschool.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestAPI {

    @GetMapping("/")
    public String list(){
        return "index";
    }

}
