package com.mipaquete;

public class ConcatenarStrings {
    /*
    En este ejercicio tenéis que crear un bucle que permita concatenar textos e imprima el
    resultado final por consola.
    Tened en cuenta que los textos pueden venir de un array de tipo String.
    */
    public static void main(String[] args) {
        String[] muchasCositas = new String[] {"Hola","mi","Nombre","es","Daniel","Soy","Full-Stack","Developer"};
        String textoConcatenado = "";

        for(String texto : muchasCositas) {
            textoConcatenado += " " + texto;
        }

        System.out.println(textoConcatenado);
    }
}
