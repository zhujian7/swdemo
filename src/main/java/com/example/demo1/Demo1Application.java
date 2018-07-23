package com.example.demo1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class Demo1Application {
    @Value("${test.url}")
    String url;

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }


    @RequestMapping("/demo1/test")
    public String test(){
        return "这是测试demo"+url;
    }
}
