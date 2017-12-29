package com.cn.web.Interface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "manager",fallback = ClientCB.class)
public interface TestClient {

    @RequestMapping(method = RequestMethod.GET, value = "/test/add")
    int add(@RequestParam(value = "a") int a, @RequestParam(value = "b") int b);
}
