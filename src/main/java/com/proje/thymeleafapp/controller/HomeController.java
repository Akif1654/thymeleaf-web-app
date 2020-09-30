package com.proje.thymeleafapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {

    @RequestMapping({"", "/home"})
    public String home() {
        return "index";
    }

    @RequestMapping("/login")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/logout-success")
    public String logoutPage(){
        return "logout";
    }
}