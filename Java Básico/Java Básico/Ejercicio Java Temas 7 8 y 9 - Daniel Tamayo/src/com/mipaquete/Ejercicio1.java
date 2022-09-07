package com.mipaquete;

public class Ejercicio1 {
    /*
    Crea un array unidimensional de Strings y recórrelo, mostrando únicamente sus valores.
    */
    public static void main(String[] args) {

        //Ejercicio 2: Recorrer y mostrar un array unidimensional
        String[] lenguajes = new String[4];
        lenguajes[0] = "Java";
        lenguajes[1] = "Python";
        lenguajes[2] = "C#";
        lenguajes[3] = "Kotlin";

        for (String dato : lenguajes){
            System.out.println(dato);
        }
    }
}
