package com.jdy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * @author Mr.jdy
 * @create 2020-06-14 10:15
 */
@SpringBootApplication
@EnableConfigServer
public class AppConfigMain {
    public static void main(String[] args) {
        SpringApplication.run(AppConfigMain.class,args);
    }
}
