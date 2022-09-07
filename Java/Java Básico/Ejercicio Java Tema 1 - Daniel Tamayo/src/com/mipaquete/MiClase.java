package com.mipaquete;

public class MiClase {
    /*
    Para este primer ejercicio tendréis que realizar lo siguiente:
    Crea un proyecto de Java desde 0
    Dentro del proyecto tenéis que crear un paquete. En el paquete tendréis que crear una clase.
    Dentro de la clase tenéis que crear el método main e imprimir todos los datos que se han visto en las sesiones.
    Recordatorio: Los tipos de datos más comunes son int, long, double, boolean, String.
     */
    public static void main(String[] args) {
        //Tipos de Datos

        //1. Numéricos

        //1.1 Enteros
        byte numByte = 15; //el dato numérico más pequeño soportado por Java, tiene 1 byte de memoria
        short numShort = 255; //dato numérico con más capacidad que byte, pero más pequeño que int
        int numInt = 3500; //el dato numérico típicamente utilizado por su capacidad.
        long numLong = 85200950; //el dato numérico con más capacidad soportado por java

        //1.2 Decimales o Flotantes
        float numFloat = 45.9f; //el dato numérico decimal con menor capacidad de Java. Siempre se especifica el
                                //dato con una f al final para definirlo como float
        double numDouble = 1498.65; //el dato numérico decimal con mayor capacidad de Java.

        //2 Caracteres
        char caracter = 'D'; //el tipo de dato char almacena un solo carácter en memoria. Se lo inicializa con ''
        String caracteres = "Hola Mundo :D"; //el tipo de dato String almacena un conjunto de caracteres.
                                             // Se lo inicializa con ""
        //3 Booleanos
        boolean logico = true;  //boolean es un tipo de dato lógico. Contiene únicamente verdadero o falso
                                //Generalmente se los usa para comprobar condiciones

        //Ejecución de la función para imprimir los datos
        imprimirDatos(numByte,numShort,numInt,numLong,numFloat,numDouble,caracter,caracteres,logico);
    }
    public static void imprimirDatos(byte a, short b, int c, long d, float e, double f, char g, String h, boolean i){
        System.out.printf("Datos numéricos\nEnteros - byte=" + a + " short=" + b + " int=" + c + " long=" + d + "\n");
        System.out.printf("Decimales - float=" + e + " double=" + f + "\n");
        System.out.printf("Caracteres - char=" + g + " String=" + h + "\n");
        System.out.printf("Booleano - boolean=" + i);
    }
}