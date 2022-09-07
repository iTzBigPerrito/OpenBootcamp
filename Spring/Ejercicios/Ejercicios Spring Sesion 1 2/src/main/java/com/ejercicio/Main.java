package com.ejercicio;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // EJERCICIO 1
        // Creación de un Bean mediante un archivo .xml y unas clase Java para llamar a su método en el main.
        /*
        ApplicationContext context1 = new ClassPathXmlApplicationContext("beans.xml");
        Saludo sayHi = (Saludo) context1.getBean("saludo");

        sayHi.saludando();
        */

        // EJERCICIO 2
        // Mediante el escaneo de Clases, Spring trata a las 2 clases utilizadas aquí como Beans gracias a la anotación
        // @Component.
        ApplicationContext context2 = new ClassPathXmlApplicationContext("beans.xml");
        UserService usuarioServicio = (UserService) context2.getBean(UserService.class);

        usuarioServicio.notificacion.notificationSalute();
    }
}
