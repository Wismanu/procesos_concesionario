package com.procesos.concesionario.controllers;

import com.procesos.concesionario.models.User;
import com.procesos.concesionario.services.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;
    @GetMapping(value = "/user/{id}")
    public User getById(@PathVariable(name = "id") Long id){
        return  userServiceImp.getUserById(id);

    }
    @PostMapping(value = "/user")
    public User createUser(@RequestBody User user){
        return userServiceImp.createUser(user);
    }
}
