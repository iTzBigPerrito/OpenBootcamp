package com.mipaquete;

public class Ejercicio2 {
    /*
    Crea un array bidimensional de enteros y recórrelo, mostrando la posición y el valor de cada
    elemento en ambas dimensiones.
    */
    public static void main(String[] args) {
        //Declaración de array bidimensional de 3 filas, 2 columnas cada uno
        int[][] sueldosNetos = new int[3][2];
        sueldosNetos[0][0] = 7000;
        sueldosNetos[0][1] = 450;
        sueldosNetos[1][0] = 18000;
        sueldosNetos[1][1] = 9;
        sueldosNetos[2][0] = 1500;
        sueldosNetos[2][1] = 100000;

        //Bucle doble anidado for para recorrer el array bidimensional
        for (int i = 0; i < sueldosNetos.length; i++){
            System.out.println("Fila " + i);
            for (int j = 0; j < sueldosNetos[i].length; j++){
                System.out.println("Columna" + j);
                System.out.println("Elemento del array = " + sueldosNetos[i][j]);
            }
        }
    }
}
