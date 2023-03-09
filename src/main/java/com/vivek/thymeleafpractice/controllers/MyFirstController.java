package com.vivek.thymeleafpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class MyFirstController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage(){
        System.out.println("in about handler");
        return "about";
    }

}
