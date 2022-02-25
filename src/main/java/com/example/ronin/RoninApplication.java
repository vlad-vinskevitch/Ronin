package com.example.ronin;

import com.example.ronin.client.Charts;
import com.example.ronin.controller.ThreadSystem;
import com.example.ronin.client.Gosuslugi;
import com.example.ronin.client.ScrfClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ConfigurableApplicationContext;

@EnableFeignClients
@SpringBootApplication
public class RoninApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(RoninApplication.class, args);

        for (int i = 0; i <= 100; i ++) {
            new ThreadSystem(context.getBean(Gosuslugi.class),
                    context.getBean(ScrfClient.class),
                    context.getBean(Charts.class)).start();
        }
    }
}
