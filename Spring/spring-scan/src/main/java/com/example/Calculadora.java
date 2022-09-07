package com.example;

import org.springframework.stereotype.Component;

// Mediante la anotación @Component, Spring detecta a una clase Java como Bean y lo administra como tal.
@Component
public class Calculadora {

    public Calculadora(){
        System.out.println("Ejecutando constructor de Calculadora");
    }
    public String holaMundo() {
        return "Hola Mundo!";
    }
}
