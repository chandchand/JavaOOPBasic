package com.belajarspring.belajarspring.aplikasi;

import com.belajarspring.belajarspring.InjectConstructor;
import com.belajarspring.belajarspring.InjectSetter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath:/config/configSpring.xml")
@ComponentScan("com.belajarspring.belajarspring")

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
