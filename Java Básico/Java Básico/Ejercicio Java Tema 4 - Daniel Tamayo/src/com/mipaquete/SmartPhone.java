package com.mipaquete;

public class SmartPhone extends SmartDevice{
    // Atributos

    int capacidad;
    boolean estuche;

    // Constructores

    public SmartPhone() {
    }

    public SmartPhone(String pantalla, String fabricante, String sistemaOp, int botones, int capacidad, boolean estuche) {
        super(pantalla, fabricante, sistemaOp, botones);
        this.capacidad = capacidad;
        this.estuche = estuche;
    }

    // ToString

    @Override
    public String toString() {
        return "SmartPhone{" +
                "capacidad='" + capacidad + '\'' +
                ", estuche=" + estuche +
                ", pantalla='" + pantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOp='" + sistemaOp + '\'' +
                ", botones=" + botones +
                '}';
    }
}