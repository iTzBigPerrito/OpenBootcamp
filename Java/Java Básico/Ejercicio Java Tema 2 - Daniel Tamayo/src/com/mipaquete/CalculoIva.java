package com.mipaquete;

import java.util.Scanner;

public class CalculoIva {
    /*
    Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido
     */
    public static void main(String[] args) {
        //Escanea un valor por consola y la guarda en la variable precio de tipo double.
        Scanner ingresarPrecio = new Scanner(System.in);
        System.out.println("Ingresa un precio por tu producto:");
        double precio = ingresarPrecio.nextDouble();

        //Imprime el valor calculado en la función calcularIVA por consola.
        System.out.println("El precio + IVA es: " + calcularIva(precio));
    }

    public static double calcularIva(double precio) {
        double precioIva = precio + (precio * 0.12); // El IVA vigente en Ecuador es del 12% para bienes y servicios.
        return precioIva;
    }
}
