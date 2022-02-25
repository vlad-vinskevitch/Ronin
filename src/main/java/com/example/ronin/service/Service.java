package com.example.ronin.service;

import com.example.ronin.client.Gosuslugi;
import lombok.RequiredArgsConstructor;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class Service {

    private final Gosuslugi gosuslugi;

    public void post() {
        gosuslugi.get();
    }
}
