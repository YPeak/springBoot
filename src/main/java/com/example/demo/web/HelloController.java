package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuwei.yu.
 * on 2018/5/12.
 */
@RestController
public class HelloController {
    @RequestMapping("hello")
    public String test(){
        return "hello world";
    }
}
