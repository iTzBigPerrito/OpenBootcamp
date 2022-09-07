package com.mipaquete;

import java.util.ArrayList;

public class Ejercicio6 {
    /*
    Crea un ArrayList de tipo int, y, utilizando un bucle rellénalo con elementos 1..10.
    A continuación, con otro bucle, recórrelo y elimina los números pares.
    Por último, vuelve a recorrerlo y muestra el ArrayList final.
    Si te atreves, puedes hacerlo en menos pasos, siempre y cuando cumplas el primer "for" de relleno.
    */
    public static void main(String[] args) {
        // Declaración de un ArrayList de tipo Integer
        ArrayList<Integer> numeros = new ArrayList<>();
        // Bucle for para rellenar el ArrayList
        for(int i = 0; i < 10; i++){
            numeros.add(i+1);
        }
        // Bucle for con el que se eliminan los números pares del ArrayList
        for (int i = 0; i < numeros.size(); i++){
            if(numeros.get(i) % 2 == 0){
                try {
                    numeros.remove(i);
                }catch (IndexOutOfBoundsException e){
                    System.out.println("Se intentó acceder a un dato que no existe: " + e.getMessage());
                }
            }
        }
        //Bucle for para mostrar el ArrayList final
        for (int num : numeros){
            System.out.println(num);
        }
    }
}
