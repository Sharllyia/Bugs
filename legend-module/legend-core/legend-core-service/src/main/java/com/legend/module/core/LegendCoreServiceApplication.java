package com.legend.module.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LegendCoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LegendCoreServiceApplication.class, args);
    }
}
