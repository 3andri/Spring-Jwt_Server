package com.andri.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


//@SpringBootApplication(exclude =  {
//        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
//      })
@SpringBootApplication 
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}

}
