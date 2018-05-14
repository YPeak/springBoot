package com.example.demo.web.springBoot.controller;


import org.springframework.jms.annotation.JmsListener;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by shuwei.yu.
 * on 2018/5/14.
 */
@RestController
public class CustomerController {
    /**
     * 监听和读取信息
     */
    @JmsListener(destination = "active.queue")
    public void readActiveQueue(String message){
        System.out.println("接收到的消息为："+message);
    }

}
