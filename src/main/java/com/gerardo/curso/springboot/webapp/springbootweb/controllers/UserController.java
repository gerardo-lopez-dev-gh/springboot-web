package com.gerardo.curso.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title",
                "Hello World Spring boot MVC");

        model.addAttribute("name",
                "Gerardo");
        model.addAttribute("lastname",
                "Lopez");
        return "details";
    }
}
