package Ejercicio2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class main2 {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("beans2.xml");
        try {

            UserService userService = (UserService) context.getBean("userservice");
            String texto = userService.notification.imprimirSaludo2();
            System.out.println(texto);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }





    }
}
