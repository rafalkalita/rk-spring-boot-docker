package com.rafalkalita.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Application {

    public final Logger logger = LoggerFactory.getLogger(Application.class);

    @RequestMapping("/")
    public String home() {
        logger.info("Endpoint has been hit!");
        return "This is spring-boot-docker java application";
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
