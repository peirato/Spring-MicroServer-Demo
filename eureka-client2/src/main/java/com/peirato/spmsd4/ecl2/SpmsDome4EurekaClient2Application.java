package com.peirato.spmsd4.ecl2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SpmsDome4EurekaClient2Application {

    public static void main(String[] args) {
        SpringApplication.run(SpmsDome4EurekaClient2Application.class, args);
    }
}
