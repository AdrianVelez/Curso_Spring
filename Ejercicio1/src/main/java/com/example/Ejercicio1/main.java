package com.example.Ejercicio1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Saludo saludo = (Saludo) context.getBean("saludo");
        System.out.println(saludo.imprimirSaludo());
    }
}
