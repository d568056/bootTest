package com.sp.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@ComponentScan(basePackages = "com.sp.cloud")
@SpringBootApplication
public class Componet1Application {

	public static void main(String[] args) {
		SpringApplication.run(Componet1Application.class, args);
	}
}
