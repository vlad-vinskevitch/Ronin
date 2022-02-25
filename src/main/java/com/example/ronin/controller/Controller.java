package com.example.ronin.controller;

import com.example.ronin.client.Gosuslugi;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {

    private final Gosuslugi client;

    @GetMapping("/")
    public String get(){
        return client.get();
    }
}
