package com.peirato.spmsd4.tc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController("/hello")
public class ClientTestController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping
    public String get(){
        return restTemplate.getForObject("http://EUREKA-CLIENT/hello",String.class);
    }
}
