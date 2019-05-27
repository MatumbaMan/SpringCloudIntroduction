package com.kinglong.feign_consumer.controller;

import com.kinglong.feign_consumer.bean.User;
import com.kinglong.feign_consumer.service.HelloService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    HelloService helloService;

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2", method = RequestMethod.GET)
    public String helloConsumer2() {
        StringBuilder sb = new StringBuilder();
        sb.append(helloService.hello()).append("\r\n");
        sb.append(helloService.hello("DIDI1")).append("\r\n");
        sb.append(helloService.hello("DIDI2", 20)).append("\r\n");
        sb.append(helloService.hello(new User("DIDI3", 31))).append("\r\n");
        return sb.toString();
    }
}