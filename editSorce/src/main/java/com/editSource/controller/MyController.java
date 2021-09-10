package com.editSource.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/editSource")
public class MyController {

    @RequestMapping("/aaa")
    public String entrance() {

        return "test";
    }

}
