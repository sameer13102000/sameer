package com.sameer.sameer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sameer.sameer.springJava.AppConfig;

@SpringBootApplication
public class SameerApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		// The above code will refer the AppConfig file to initialize the bean. 
		//Laptop lap = context.getBean("Rocky", Laptop.class); -> By default the name of the method in the Bean config class for desktop
		// is taken as Bean name getLaptopBean in this case. If you want to explictly call by another name above is the code for Bean by name.
		
		// Laptop lap = context.getBean("getLaptopBean", Laptop.class);
		// lap.compile();

		// Laptop lap1 = context.getBean("getLaptopBean", Laptop.class);
		// lap1.compile();


		Programer pgm = context.getBean(Programer.class);
		System.out.println("age: "+pgm.getAge());
		pgm.code();

		
	}

}
