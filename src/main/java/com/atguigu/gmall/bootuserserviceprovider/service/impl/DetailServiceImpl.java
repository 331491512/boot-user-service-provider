package com.atguigu.gmall.bootuserserviceprovider.service.impl;

import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import com.atguigu.gmall.service.DetailService;

@Service // 注意：暴露服务
@Component
public class DetailServiceImpl implements DetailService {

    public String sayHellow() {
        System.out.println("sayHellow方法");

        return "这是sayHellow方法的输出……";
    }

}
