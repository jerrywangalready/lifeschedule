package com.tmxk.lifeschedule;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.tmxk.lifeschedule.goal.mapper")
@SpringBootApplication
public class LifescheduleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LifescheduleApplication.class, args);
    }

}
