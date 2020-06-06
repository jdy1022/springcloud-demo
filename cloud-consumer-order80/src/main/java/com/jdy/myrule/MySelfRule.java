package com.jdy.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Configuration;

/**
 * @author Mr.jdy
 * @create 2020-06-05 20:37
 */
@Configuration
public class MySelfRule {
    public IRule myRule(){
        return new RandomRule();//定义为随机
    }
}
