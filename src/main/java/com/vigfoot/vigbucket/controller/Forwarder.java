package com.vigfoot.vigbucket.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Forwarder {

    @GetMapping("/")
    public String goIndex() {
        System.out.println("hi");
        return "index";
    }
}
