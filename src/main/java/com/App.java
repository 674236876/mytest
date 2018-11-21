package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * $DESCIRPTION
 *
 * @author zgp
 * @create 2018 - 11 - 20 17:10
 */
@SpringBootApplication
@MapperScan("com.myd.dao")
public class App {
    public static void main(String args[]){
        SpringApplication.run(App.class, args);
    }
}
