package com.gerardo.curso.springboot.webapp.springbootweb.controllers;

import com.gerardo.curso.springboot.webapp.springbootweb.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Gerardo", "Lopez");
        model.addAttribute("title",
                "Hello World Spring boot MVC");

        model.addAttribute("user",
                user);

        return "details";
    }
}
