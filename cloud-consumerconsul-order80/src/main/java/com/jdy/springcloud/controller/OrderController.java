package com.jdy.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.jdy
 * @create 2020-06-02 22:52
 */
@RestController
public class OrderController {

    private static final String PAYMENT_URL="http://localhost:8006";

    @Autowired
    private RestTemplate template;

    @GetMapping("/consumer/payment/consul")
    public String getPayment(){
        return template.getForObject(PAYMENT_URL+"/payment/consul/",String.class);
    }
}
