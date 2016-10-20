package com.rafalkalita.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Rafal Kalita - This is spring-boot-docker java application hosted on AWS ec2";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
