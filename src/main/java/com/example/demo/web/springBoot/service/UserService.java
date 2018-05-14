package com.example.demo.web.springBoot.service;

import com.example.demo.web.springBoot.po.User;

import java.util.List;


/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
public interface UserService {
    List<User> selectAllUser();
    void deleteUser(Integer id);
}
