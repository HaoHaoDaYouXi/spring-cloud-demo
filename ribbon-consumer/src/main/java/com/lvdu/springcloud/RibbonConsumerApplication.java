package com.lvdu.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

/**
 * RibbonConsumerApplication
 *
 * @author wangxt
 * @date 2019/4/9
 */
@ComponentScan
@EnableDiscoveryClient
@SpringBootApplication
public class RibbonConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(RibbonConsumerApplication.class, args);
    }

    /**
     * RestTemplate
     * @LoadBalanced 表示开启负载均衡
     * @return
     */
    @Bean
    @Autowired
    @LoadBalanced
    RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
