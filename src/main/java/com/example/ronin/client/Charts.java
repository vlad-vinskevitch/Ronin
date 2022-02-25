package com.example.ronin.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name = "charts", url = "https://charts3.equitystory.com/chart/sberbank-v31/English")
public interface Charts {

    @GetMapping("/")
    public String get();

}
