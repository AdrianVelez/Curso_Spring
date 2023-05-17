package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Application {

	public static void main(String[] args) {

	ApplicationContext context = SpringApplication.run(Ejercicio3Application.class, args);

	UsuarioRepository repository = context.getBean(UsuarioRepository.class);

	Usuario usuario = new Usuario(null, "Adrian", "Hombre", "10@gmail", "1234567891");
	Usuario usuario2 = new Usuario(null, "Cristiano", "Hombre", "cr7@gmail", "9874561235");
	Usuario usuario3 = new Usuario(null, "Leo", "Hombre", "messi@gmail", "4772745263");

	repository.save(usuario);
	repository.save(usuario2);
	repository.save(usuario3);

	System.out.println(repository.findAll());


	}

}
