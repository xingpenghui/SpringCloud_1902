package com.qfedu.cloud_helloconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableDiscoveryClient //发现服务
@EnableFeignClients //基于Feign实现服务消费
@EnableSwagger2 //启用Swagger
public class CloudHelloconsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudHelloconsumerApplication.class, args);
    }
}
