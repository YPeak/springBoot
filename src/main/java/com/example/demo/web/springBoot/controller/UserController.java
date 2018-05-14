package com.example.demo.web.springBoot.controller;

import com.example.demo.web.springBoot.po.User;
import com.example.demo.web.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("userList")
    public List<User> getAllUser(){
        System.out.println("进入controller");
        return userService.selectAllUser();
    }
    @RequestMapping("userList1")
    public String getAllUser1(){
        System.out.println("进入controller");
        return "123123123";
    }
}
