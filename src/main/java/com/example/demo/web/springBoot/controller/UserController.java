package com.example.demo.web.springBoot.controller;

import com.example.demo.web.springBoot.po.User;
import com.example.demo.web.springBoot.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
@RestController
public class UserController {
    private final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;

    @RequestMapping("userList")
    public List<User> getAllUser(){
        System.out.println("进入controller");
        logger.error("asdfasdfasdfasdf");
        return this.userService.selectAllUser();
    }

    @RequestMapping("deleteUser/{id}")
    public void deleteUser(@PathVariable Integer id){
        System.out.println("delete");
         this.userService.deleteUser(id);
    }
}
