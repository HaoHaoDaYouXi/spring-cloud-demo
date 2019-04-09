package com.lvdu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * ZuulServiceApplication
 * 与zuul实现同样的功能还有kong，
 * 官网地址：https://getkong.org
 *
 * @author guooo
 *
 */
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class ZuulServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulServiceApplication.class, args);
    }

}
