package com.jdy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.jdy
 * @create 2020-06-01 21:50
 */
@RestController
public class OrederController {

    private static final String PAYMENT_URL="http://localhost:8004";

    @Autowired
    private RestTemplate template;

    @GetMapping("/consumer/payment/zk")
    public String getPayment(){
        return template.getForObject(PAYMENT_URL+"/payment/zk/",String.class);
    }
}
