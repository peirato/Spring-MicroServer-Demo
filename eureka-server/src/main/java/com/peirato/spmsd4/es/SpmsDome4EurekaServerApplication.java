package com.peirato.spmsd4.es;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpmsDome4EurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpmsDome4EurekaServerApplication.class, args);
    }
}
