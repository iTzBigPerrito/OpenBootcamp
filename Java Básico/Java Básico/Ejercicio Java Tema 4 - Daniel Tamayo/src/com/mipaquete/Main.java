package com.mipaquete;

public class Main {
    /*
    En este ejercicio tendréis que crear una clase SmartDevice. Dentro crearéis las clases hijas:
    SmartPhone y SmartWatch.
    Agregaréis atributos tal cual tendrían esos objetos en la realidad.
    Crear constructor vacío y con todos los parámetros para cada clase.
    Desde una clase Main: crearéis objetos de cada una y los utilizaréis para imprimir sus valores por consola.
    */
    public static void main(String[] args) {
        SmartDevice miTelefono;
        SmartDevice miReloj;
        miTelefono = new SmartPhone("LCD","Samsung","Android",4,256,true);
        miReloj = new SmartWatch("LCD","Xiaomi","Wear OS",3,true);

        System.out.println(miTelefono.toString());
        System.out.println(miReloj.toString());
    }
}
