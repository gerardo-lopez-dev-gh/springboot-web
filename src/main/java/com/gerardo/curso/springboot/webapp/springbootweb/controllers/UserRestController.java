package com.gerardo.curso.springboot.webapp.springbootweb.controllers;

import com.gerardo.curso.springboot.webapp.springbootweb.dto.UserDto;
import com.gerardo.curso.springboot.webapp.springbootweb.models.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto detailsDto(){
        UserDto userDto = new UserDto();
        User user = new User("Gerardo", "Lopez");
        userDto.setUser(user);
        userDto.setTitle("Hello World Spring boot MVC");
        return userDto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user1 = new User("Gerardo", "Lopez");
        User user2 = new User("Persona2", "Apellido2");
        User user3 = new User("Persona3", "Apellido3");
        User user4 = new User("Persona4", "Apellido4");
        User user5 = new User("Persona5", "Apellido5");
        return List.of(user1, user2, user3, user4, user5);
    }

    @GetMapping("/details2")
    public Map<String, Object> details(){
        User user = new User("Gerardo", "Lopez");

        Map<String, Object> model = new HashMap<>();
        model.put("title", "Hello World Spring boot MVC");
        model.put("user", user);
        return model;
    }


}
