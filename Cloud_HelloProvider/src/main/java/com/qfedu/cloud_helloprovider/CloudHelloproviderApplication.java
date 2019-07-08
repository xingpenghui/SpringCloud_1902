package com.qfedu.cloud_helloprovider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //注册服务 标记这是客户端
public class CloudHelloproviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudHelloproviderApplication.class, args);
    }

}
