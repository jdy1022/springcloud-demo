package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author Mr.jdy
 * @create 2020-06-08 21:26
 */
@SpringBootApplication
@EnableHystrixDashboard
public class Dashboard9001Main {
    public static void main(String[] args) {
        SpringApplication.run(Dashboard9001Main.class,args);
    }
}
