package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String index1() {
        return "index1";
    }
        @RequestMapping("/login")
    public String login(){
        return "login";

    }
}
