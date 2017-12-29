package com.cn.web.controller;

import com.cn.web.Interface.TestClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class AddController {
    @Autowired
    private TestClient client;

    @RequestMapping(method = RequestMethod.GET, value = "/add")
    public Integer add() {
        return client.add(10, 20);
    }
}
