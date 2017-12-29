package com.cn.web.Interface;

import org.springframework.stereotype.Component;

@Component
public class ClientCB implements TestClient {
    @Override
    public int add(int a, int b) {
        return -9999;
    }
}
