package com.example.springboot02.controller;

import com.example.springboot02.model.User;
import com.example.springboot02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author cky
 * @Description: user的控制陈实现
 * @date 2021.09.07 18:26
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping(value = "/selectAllUser")
    public @ResponseBody Object selectAllUser(){
        return userService.selectAllUser();
    }

    @GetMapping(value = "/insertUser")
    public @ResponseBody Object insertUser(String name,int age) {
        User user = new User();
        user.setAge(age);
        user.setName(name);
        return userService.insertUser(user);
    }
}
