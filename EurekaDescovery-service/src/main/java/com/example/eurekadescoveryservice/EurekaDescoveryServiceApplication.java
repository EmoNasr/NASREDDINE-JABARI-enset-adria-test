package com.example.eurekadescoveryservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaDescoveryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaDescoveryServiceApplication.class, args);
    }

}
