package com.zyt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

//添加springboot启动注解
@SpringBootApplication
//添加事务启动注解
@EnableTransactionManagement
@MapperScan("com.zyt.mapper")
public class  OnlineDrinkMallApplication{
    public static void main( String[] args ){
        SpringApplication.run(OnlineDrinkMallApplication.class,args);
    }
}
