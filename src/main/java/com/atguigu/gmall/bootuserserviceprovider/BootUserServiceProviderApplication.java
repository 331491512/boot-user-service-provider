package com.atguigu.gmall.bootuserserviceprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo // 注意：需要启动Dubbo注解服务
public class BootUserServiceProviderApplication { // 注意启动类的位置，否则影响路径访问

    public static void main(String[] args) {
        SpringApplication.run(BootUserServiceProviderApplication.class, args);
        System.err.println("【服务生产端】启动成功……");
    }

}
