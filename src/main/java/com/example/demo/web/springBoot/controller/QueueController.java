package com.example.demo.web.springBoot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;

/**
 * Created by shuwei.yu.
 * on 2018/5/14.
 */
@RestController
public class QueueController {

    @Autowired
    private JmsMessagingTemplate jmsMessagingTemplate;

    @Autowired
    private Queue queue;

    @RequestMapping("/send")
    public void send(){
//        指定发送的目的、内容
        this.jmsMessagingTemplate.convertAndSend(this.queue,"yusw消息发送！");
    }


}
