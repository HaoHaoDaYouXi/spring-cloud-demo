package com.lvdu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
/**
 * FeignApplication
 *
 * @author wangxt
 * @date 2019/4/9
 */
@ComponentScan
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class FeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }

}
