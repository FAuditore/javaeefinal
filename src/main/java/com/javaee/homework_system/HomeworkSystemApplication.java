package com.javaee.homework_system;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.javaee.homework_system.dao")
public class HomeworkSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(HomeworkSystemApplication.class, args);
    }

}
