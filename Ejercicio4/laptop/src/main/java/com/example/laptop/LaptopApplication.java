package com.example.laptop;

import com.example.laptop.entities.Laptop;
import com.example.laptop.repository.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class LaptopApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(LaptopApplication.class, args);
		LaptopRepository laptopRepository = context.getBean(LaptopRepository.class);

		Laptop laptop1 = new Laptop(null, "asusGamer", "Asus", 17.5);
		Laptop laptop2 = new Laptop(null, "Gamer", "HP", 13.7);


		laptopRepository.save(laptop1);
		laptopRepository.save(laptop2);


	}



}
