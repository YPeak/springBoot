package com.example.demo;


import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;

import javax.jms.Queue;

@SpringBootApplication
@EnableCaching//开启redis缓存
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}



	@Bean//ActiveMQ的应用
	public Queue queue(){//不要引用错类
		return new ActiveMQQueue("active.queue");
	}
}
