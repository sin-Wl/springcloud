package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        //负载均衡规则改为随机(RandomRule)，默认为轮询(RoundRobinRule)
        //其他负载均衡规则切换类似
        return new RandomRule();
    }
}

