package com.belajarspring.belajarspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import ch.qos.logback.core.Context;

@SpringBootApplication
public class BelajarspringApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BelajarspringApplication.class, args);
		InjectConstructor injectConstructor1 = (InjectConstructor) context.getBean("injectConstructor");

		System.out.println("\nIni menggunakan injek constructor");
		injectConstructor1.getMessage();

		InjectSetter injectSetter1 = (InjectSetter) context.getBean("injectSetter");

		System.out.println("\nIni menggunakan injek setter");
		injectSetter1.getMessage();
	}

}
