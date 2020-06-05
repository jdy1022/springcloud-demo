package com.jdy.springcloud.controller;

import com.jdy.springcloud.entities.CommonResult;
import com.jdy.springcloud.entities.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.jdy
 * @create 2020-05-29 20:18
 */
@RestController
public class OrderController {
    //单机版
    //private static final String PAYMENT_URL="http://localhost:8001";
    //集群版 写服务名称
    private static final String PAYMENT_URL="http://CLOUD-PAYMENT-SERVICE";
    @Autowired
    private RestTemplate template;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment){
        return template.postForObject(PAYMENT_URL+"/payment/create",payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment1/create")
    public CommonResult<Payment> create2(Payment payment){
        ResponseEntity<CommonResult> commonResultResponseEntity = template.postForEntity(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
        return commonResultResponseEntity.getBody();
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPayment(@PathVariable("id") Long id){
        return template.getForObject(PAYMENT_URL+"/payment/get/"+id,CommonResult.class);
    }

    @GetMapping("/consumer/payment/getEntity/{id}")
    public CommonResult<Payment> getPayment2(@PathVariable("id") Long id){
        ResponseEntity<CommonResult> forEntity = template.getForEntity(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
        CommonResult result =null;
        if(forEntity.getStatusCode().is2xxSuccessful()){
            result = forEntity.getBody();
        }else{
            result = new CommonResult();
        }
        return result;
    }

}
