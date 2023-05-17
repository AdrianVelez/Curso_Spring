package Ejercicio2;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    public NotificationService(){
        System.out.println("Constructor NotificationService...");
    }

    public String imprimirSaludo2(){
        return "Hola Mundo";
    }


}
