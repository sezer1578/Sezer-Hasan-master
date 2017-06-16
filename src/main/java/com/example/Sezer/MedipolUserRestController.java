package com.example.Sezer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by SEZER on 30.05.2017.
 */
@RestController
public class MedipolUserRestController {

    @Autowired
    private UserService userService;


    @RequestMapping
    public List<User> findUsers()
    {
        return userService.findUsers();

    }
    @RequestMapping(path = "/addUser")
    public List<User> addUser(@RequestParam String name, @RequestParam String surName){

        userService.addUser(name, surName);

        return userService.findUsers();
    }

    @RequestMapping(path = "/usersByName")
    public List<User> findUsersByName(@RequestParam String name){

        System.out.println("disardan gonderilen deger : " + name);

        return userService.findUsersByName(name);
    }



}
