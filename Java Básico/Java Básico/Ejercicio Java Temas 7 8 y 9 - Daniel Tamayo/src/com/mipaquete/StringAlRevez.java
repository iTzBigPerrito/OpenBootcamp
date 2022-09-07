package com.mipaquete;

public class StringAlRevez {
    /*
    Dada la función:
    public static String reverse(String texto) { }
    Escribe el código que devuelva una cadena al revés. Por ejemplo, la cadena "hola mundo", debe retornar "odnum aloh".
     */
    public static void main(String[] args) {
        // Ejercicio 1: Cadena al revés
        String textoReverse = reverse("Mi nombre es Daniel");
        System.out.println(textoReverse);
    }
    //Esta función devuelve una cadena de caracteres al revés
    public static String reverse(String texto) {
        String tx = "";
        for (int i = texto.length() - 1; i >= 0; i--){
            tx += texto.charAt(i);
        }
        return tx;
    }
}
