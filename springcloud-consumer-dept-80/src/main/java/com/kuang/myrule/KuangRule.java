package com.kuang.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KuangRule {

    @Bean
    public IRule myRule(){
        return new RoundRobinRule(); //默认是轮询，现在我们定义为~ KuangRandomRule
    }

}
