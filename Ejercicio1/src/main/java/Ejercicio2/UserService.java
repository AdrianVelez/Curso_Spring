package Ejercicio2;

import org.springframework.stereotype.Component;

@Component("UserService")
public class UserService {

    NotificationService notification;

    public UserService(NotificationService notification){
        System.out.println("constructor UserService");
        this.notification=notification;
    }


}
