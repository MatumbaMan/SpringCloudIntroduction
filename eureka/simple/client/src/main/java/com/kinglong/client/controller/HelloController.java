package com.kinglong.client.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    public String index() {
        return "hello, king";
    }
}