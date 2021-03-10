package com.rzw.web.controller;

import com.rzw.biz.UserService;
import com.rzw.dao.UserDao;
import com.rzw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
//    @Autowired
//    private UserDao userDao;
    @RequestMapping("/get")
    @ResponseBody
    public String get(String name){
        System.out.println(name);
        userService.add(new User("zqy",28));
        return "ok";
    }
}

