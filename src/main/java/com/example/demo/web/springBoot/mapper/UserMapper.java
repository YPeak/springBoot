package com.example.demo.web.springBoot.mapper;


import com.example.demo.web.springBoot.po.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
@Mapper
public interface UserMapper {
    @Select("select * from tb_user")
    List<User> selectUser();

}
