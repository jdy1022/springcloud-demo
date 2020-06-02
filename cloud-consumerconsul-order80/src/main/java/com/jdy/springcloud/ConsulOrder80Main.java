package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Mr.jdy
 * @create 2020-06-02 22:49
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrder80Main {
    public static void main(String[] args) {
        SpringApplication.run(ConsulOrder80Main.class,args);
    }
}
