package com.jdy.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Mr.jdy
 * @create 2020-06-02 22:50
 */
@Configuration
public class ApplicationContextConfig {

    @Bean
    public RestTemplate getRestTemplat(){
        return new RestTemplate();
    }
}
