package com.example.ronin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "gosuslugi", url = "https://www.gosuslugi.ru")
public interface Gosuslugi {

    @GetMapping("/")
    public String get();
}
