package com.mipaquete;

public class SmartWatch extends SmartDevice{
    //Atributos

    boolean podometro;

    //Constructores
    public SmartWatch() {
    }

    public SmartWatch(String pantalla, String fabricante, String sistemaOp, int botones, boolean podometro) {
        super(pantalla, fabricante, sistemaOp, botones);
        this.podometro = podometro;
    }

    // ToString

    @Override
    public String toString() {
        return "SmartWatch{" +
                "podometro=" + podometro +
                ", pantalla='" + pantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOp='" + sistemaOp + '\'' +
                ", botones=" + botones +
                '}';
    }
}