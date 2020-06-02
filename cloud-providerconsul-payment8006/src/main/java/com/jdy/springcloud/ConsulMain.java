package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mr.jdy
 * @create 2020-06-02 22:35
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulMain {
    public static void main(String[] args) {
        SpringApplication.run(ConsulMain.class,args);
    }
}
