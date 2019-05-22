package com.kinglong.introduction.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${book.name}")
    private String bookName;

    @RequestMapping("/hello")
    public String hello() {
        return "hello, king. 自定义参数为 " + bookName;
    }
}