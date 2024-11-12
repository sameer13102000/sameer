package com.sameer.SpringBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.sameer.SpringBootDemo.model.Laptop;
import com.sameer.SpringBootDemo.model.Programmer;
import com.sameer.SpringBootDemo.service.LaptopService;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootDemoApplication.class, args);
		Laptop lap = context.getBean(Laptop.class);
		LaptopService service = context.getBean(LaptopService.class);
		lap.compile();
		service.addLaptop(lap);
		if(service.isGoodForProgramming(lap)){
			System.out.println("This Laptop is good for Programming");
		}
		else{
			System.out.println("This Laptop is not good for Programming");

		}
	}

}