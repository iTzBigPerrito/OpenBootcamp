package com.mipaquete;

import java.io.*;

public class Ejercicio8 {
    /*
    Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: "fileIn" y "fileOut".
    La tarea de la función será realizar la copia del fichero dado en el parámetro "fileIn" al
    fichero dado en "fileOut".
    */
    public static void main(String[] args) {
        try {
            // Se declaran 2 tipos de objetos, uno de tipo InputStream y otro de tipo PrintStream
            InputStream fileIn = new FileInputStream("copia.txt");
            PrintStream fileOut = new PrintStream("pegado.txt");
            // Se envían los 2 objetos creados a una función para duplicar el contenido de InputStream en PrintStream
            CopiarFichero(fileIn,fileOut);
        }catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }
    }
    //Esta función se encarga de leer el contenido del archivo copia.txt y lo copia en un nuevo archivo pegado.txt
    public static void CopiarFichero(InputStream fileIn, PrintStream fileOut){
        try {
            byte[] datos = fileIn.readAllBytes();
            fileOut.write(datos);
            fileIn.close();
            fileOut.close();
        }catch (IOException e){
            System.out.println("Archivo ingresado no válido: " + e.getMessage());
        }
    }
}
