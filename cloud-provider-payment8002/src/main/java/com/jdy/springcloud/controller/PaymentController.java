package com.jdy.springcloud.controller;


import com.jdy.springcloud.entities.CommonResult;
import com.jdy.springcloud.entities.Payment;
import com.jdy.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;


@RestController
@Slf4j
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;


    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id){
        Payment payment = paymentService.getPaymentById(id);
        if(payment != null) {
            CommonResult<Payment> commonResult = new CommonResult(200, "查询成功"+serverPort, payment);
            return commonResult;
        }else{
            return new CommonResult(444,"没有对应记录,查询ID:");
        }
    }

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0)
        {
            return new CommonResult(200,"插入数据库成功,serverPort: ");
        }else{
            return new CommonResult(444,"插入数据库失败",null);
        }
    }


}
