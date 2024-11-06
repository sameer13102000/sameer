package com.sameer.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SameerApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SameerApplication.class, args);
		// Programer pgm = new Programer();
		// pgm.code();

		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		Programer pgm = (Programer) context.getBean("programer");
		pgm.code();
		System.out.println("age "+pgm.getAge());
	}

}
