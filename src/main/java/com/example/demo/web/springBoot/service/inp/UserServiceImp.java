package com.example.demo.web.springBoot.service.inp;

import com.example.demo.web.springBoot.mapper.UserMapper;
import com.example.demo.web.springBoot.po.User;
import com.example.demo.web.springBoot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
@Service
@Transactional
public class UserServiceImp implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
//    @Cacheable(value="UserCache",key = "'User.selectUser'")
    public List<User> selectAllUser() {
        return userMapper.selectUser();
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteUser(id);
    }
}
