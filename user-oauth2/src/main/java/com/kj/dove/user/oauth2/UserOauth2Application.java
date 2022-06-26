package com.kj.dove.user.oauth2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @ClassName UserOauth2Application
 * @Description
 * @Author daksy
 * @Date 2022/6/25 14:10
 * @Version 1.0
 **/
@SpringBootApplication
@MapperScan(basePackages = "com.kj.dove.model.dao.**")
public class UserOauth2Application {

    public static void main(String[] args) {
        SpringApplication.run(UserOauth2Application.class, args);
    }

}
