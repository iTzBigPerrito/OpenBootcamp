package com.mipaquete;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ejercicio5 {
    /*
    Crea un ArrayList de tipo String, con 4 elementos. Cópialo en una LinkedList.
    Recorre ambos mostrando únicamente el valor de cada elemento.
    */
    public static void main(String[] args) {
        // Declaración de un ArrayList de tipo String con 4 elementos
        ArrayList<String> ciudades = new ArrayList<>();
        ciudades.add("Paris");
        ciudades.add("Toronto");
        ciudades.add("Nueva York");
        ciudades.add("Londres");

        // Copiamos el contenido del ArrayList anterior a una LinkedList
        LinkedList<String> viajes = new LinkedList<>(ciudades);

        // Mostramos el contenido del ArrayList ciudades
        for(String ciudad : ciudades){
            System.out.println("Valores de ArrayList: " + ciudad);
        }
        // Mostramos el contenido de la LinkedList viajes
        for(String viaje : viajes){
            System.out.println("Valores de LinkedList: " + viaje);
        }
    }
}
