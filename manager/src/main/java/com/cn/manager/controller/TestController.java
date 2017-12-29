package com.cn.manager.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b) {
        return a + b;
    }
}
