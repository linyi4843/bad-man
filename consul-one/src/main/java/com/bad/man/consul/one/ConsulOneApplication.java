package com.bad.man.consul.one;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
@RestController
public class ConsulOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOneApplication.class, args);
    }

    @GetMapping("/")
    public String hi() {

        return "hello world";
    }
}
