package com.ejercicio;

import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    public void notificationSalute(){
        System.out.println("Hola, bienvenido!");
    }

    public NotificationService(){
    }
}
