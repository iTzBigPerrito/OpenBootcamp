package com.mipaquete;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio9 {
    /*
    Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream,
    excepciones, un HashMap y un ArrayList, LinkedList o array.
    */
    public static void main(String[] args) {
        // Aquí declaro un ArrayList que contendrá 5 Strings ingresadas por el usuario.
        ArrayList<String> games = new ArrayList<>();
        Scanner data = new Scanner(System.in);

        // Aquí llamo a la función encargada de ingresar las cadenas de texto a mi ArrayList.
        CatchData(games,data);

        // Estructura try-catch para capturar las excepciones producidas por mi función GenerateBackup y por el
        // uso de los objetos de tipo InputStream y PrintStream
        try {
            // Aquí declaro 2 objetos, uno de tipo InputStream y otro de PrintStream.
            // El primero lee un archivo .txt creado por mí en el directorio base del proyecto y el otro será el
            // encargado de crear un archivo de backup .txt con el contenido del primer archivo más el texto de mi
            // ArrayList.
            InputStream create = new FileInputStream("games.txt");
            PrintStream backup = new PrintStream("backup.txt");

            // Aquí llamo a la función que se encarga de generar y escribir el archivo .txt
            GenerateBackup(create,backup,games);

            // Sentencia if para confirmar que el archivo se haya creado correctamente.
            if (backup.checkError()) {
                System.out.println("Se produjo un error al crear tu archivo :(");
            }else {
                System.out.println("Tu archivo de BackUp se creó exitosamente!");
            }

            // Cierro todos los recursos que utilicé en el programa.
            create.close();
            backup.close();

        }
        // Sentencia catch para capturar la excepción producida por la función GenerateBackup.
        catch (FileNotFoundException e){
            System.out.println("No se encontró el archivo: " + e.getMessage());
        }
        // Sentencia catch para capturar la excepción producida por el método .close()
        catch (IOException e){
            System.out.println("No se pudo cerrar el archivo: " + e.getMessage());
        }
    }
    // Esta función se encarga de capturar por consola 5 Strings y las añade a mi ArrayList.
    public static void CatchData(ArrayList<String> games, Scanner input){
        System.out.println("Ingresa 5 juegos divertidos: ");
        for (int i = 0; i < 5; i++)
            games.add(input.nextLine());
    }
    // Esta función se encarga de leer el primer archivo .txt, convertir mi ArrayList a un Array de bytes
    // y finalmente crea un nuevo archivo con los datos del primer archivo y mi ArrayList.
    public static void GenerateBackup(InputStream fileIn, PrintStream fileOut, ArrayList<String> games) throws FileNotFoundException{
        try {
            // Leo el archivo base .txt y escribo los datos en el archivo backup
            byte[] data = fileIn.readAllBytes();
            fileOut.write(data);

            // Convierto mi ArrayList a un valor String y después lo convierto a un Array de bytes para guardarlo.
            fileOut.write(String.valueOf(games).getBytes());
        }
        // Excepción generada por mí en esta función
        catch (FileNotFoundException e){
            throw new FileNotFoundException();
        }
        // Excepción generada por el método .write()
        catch (IOException e){
            System.out.println("No se puede leer el archivo: " + e.getMessage());
        }
    }
}
