package com.cc1021.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * Ribbon 和 Eureka 整合以后，客户端可以直接调用，不用关心IP地址和端口号
 */
@SpringBootApplication
@EnableEurekaClient // eureka开启
@EnableFeignClients(basePackages = {"com.cc1021.springcloud"})
//@ComponentScan("com.cc1021.springcloud")
public class FeignDeptConsumer_80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignDeptConsumer_80.class, args);
    }
}
