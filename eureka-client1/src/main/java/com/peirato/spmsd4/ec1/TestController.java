package com.peirato.spmsd4.ec1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/hello")
public class TestController {

    @GetMapping
    public String get(){
        return "this is client1";
    }

}
