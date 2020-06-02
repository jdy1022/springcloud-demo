package com.jdy.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author Mr.jdy
 * @create 2020-06-02 22:40
 */
@RestController
public class PaymentController {

    @Value("${server.port}")
    private String serverPort;
    @RequestMapping("/payment/consul")
    public String paymentzk(){
        return "springcloud with consul:"+serverPort+"\t"+ UUID.randomUUID().toString();
    }
}
