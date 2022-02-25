package com.example.ronin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "scrf", url = "http://www.scrf.gov.ru/council/composition")
public interface ScrfClient {

    @GetMapping("/")
    public String get();

}
