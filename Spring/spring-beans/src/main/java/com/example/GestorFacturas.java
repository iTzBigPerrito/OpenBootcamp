package com.example;

public class GestorFacturas {

    // 1. Atributos
    Calculadora calculadora;
    String nombre;

    // 2. Constructores
    public GestorFacturas(Calculadora calculadora, String nombre){
        System.out.println("Ejecutando Constructor GestorFacturas");
        this.nombre = nombre;
        this.calculadora = calculadora;
    }

    // 3. Métodos
}
