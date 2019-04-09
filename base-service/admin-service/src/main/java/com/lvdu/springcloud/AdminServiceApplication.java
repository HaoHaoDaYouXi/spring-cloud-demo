package com.lvdu.springcloud;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * AdminServiceApplication
 *
 * @author wangxt
 * @date 2019/4/9
 */
@EnableAdminServer
@EnableDiscoveryClient
@SpringBootApplication(exclude = {SecurityAutoConfiguration.class })
public class AdminServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminServiceApplication.class, args);
    }

}
