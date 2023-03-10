package com.vivek.thymeleafpractice.controllers;

import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
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

    @RequestMapping(value="/condition",method = RequestMethod.GET)
    public String conditionalHandler(Model model){
        System.out.println("conditional handler executed");
        model.addAttribute("isActive",false);
        model.addAttribute("gender","M");
        List<Integer> ls=List.of(233,244,255,53,42,64);
        model.addAttribute("ls",ls);
        return "condition";
    }

    @GetMapping("/service")
    public String getServicePage(Model model){
        return "service";
    }

    @GetMapping("/newcontact")
    public String getContactPage(Model model){
        return "newcontact";
    }

    @GetMapping("/newservices")
    public String getNewServices(Model model){
        return "newservices";
    }

}
