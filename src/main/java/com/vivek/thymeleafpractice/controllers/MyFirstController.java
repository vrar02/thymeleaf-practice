package com.vivek.thymeleafpractice.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Controller
public class MyFirstController {

    @RequestMapping(value = "/about", method = RequestMethod.GET)
    public String aboutPage(Model model){
        model.addAttribute("msg","Hi..Welcome to Thymleaf ");
        model.addAttribute("currentdate", new Date().toString());
        List<String> names=new ArrayList<>(List.of("vivek","ravi","pruthvi"));
        System.out.println("in about handler");
        model.addAttribute("names",names);
        return "about";
    }
    

}
