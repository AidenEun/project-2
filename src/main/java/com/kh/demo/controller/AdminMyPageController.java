package com.kh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adminmypage/*")
public class AdminMyPageController {

    @GetMapping("#")
    public void replace(){}

}
