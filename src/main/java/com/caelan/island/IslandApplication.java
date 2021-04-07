package com.caelan.island;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.caelan.island.mapper")
public class IslandApplication {

    public static void main(String[] args) {
        SpringApplication.run(IslandApplication.class, args);
    }

}
