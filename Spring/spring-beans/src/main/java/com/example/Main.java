package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // CONCEPTO 1. Obtener Beans de Spring

        // Un Bean se crea una sola vez y se lo puede llamar en cualquier parte del código a través del contenedor
        // de Beans de Spring. Esto se define con el atributo scope en el archivo beans.xml.
        // Recibir un objeto de Spring
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Calculadora calculadora = (Calculadora) context.getBean("calculadora");

        String texto = calculadora.holaMundo();
        System.out.println(texto);


        Calculadora calculadora2 = (Calculadora) context.getBean("calculadora");
        texto = calculadora2.holaMundo();
        System.out.println(texto);

        //CONCEPTO 2. Cargar un bean dentro de otro bean
        GestorFacturas gestor = (GestorFacturas) context.getBean("gestorFacturas");
        System.out.println(gestor.calculadora.holaMundo());
        System.out.println(gestor.nombre);

        // CONCEPTO 3.
        // Los beans por defecto son singleton. Se crea un solo Bean de una clase y se lo reutiliza en toda la aplicación.
        // Se puede crear un objeto cada vez que se lo llame en el proyecto modificando el atributo scope="prototype" en
        // el archivo beans.xml
        // Se verifica comprobando cuántas veces se ejecuta un constructor.
    }
}
