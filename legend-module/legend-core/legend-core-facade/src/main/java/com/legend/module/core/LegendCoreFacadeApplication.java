package com.legend.module.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class LegendCoreFacadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegendCoreFacadeApplication.class, args);
	}
}
