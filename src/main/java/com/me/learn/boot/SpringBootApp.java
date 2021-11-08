package com.me.learn.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import springfox.documentation.spring.web.PropertySourcedMapping;

/**
 * @Classname SpringBootApp
 * @Description TODO
 * @Author 无涯
 * Date 2021/10/27 21:12
 * Version 1.0
 */
@SpringBootApplication
//@SpringBootApplication(exclude = {DataSourceTransactionManagerAutoConfiguration.class})
//启动Servlet filter listener
@ServletComponentScan(basePackages = "com.me.learn.boot")
@MapperScan("com.me.learn.boot.dao")
@PropertySource(value = "classpath:redisconfig.properties")
public class SpringBootApp {
    public static void main(String[] args) {
        SpringApplication.run(SpringBootApp.class,args);
    }
}
