package com.mipaquete;

public class SmartDevice {
    // Atributos
    String pantalla;
    String fabricante;
    String sistemaOp;
    int botones;

    // Constructores

    public SmartDevice() {
    }
    public SmartDevice(String pantalla, String fabricante, String sistemaOp, int botones) {
        this.pantalla = pantalla;
        this.fabricante = fabricante;
        this.sistemaOp = sistemaOp;
        this.botones = botones;
    }

    // ToString
    @Override
    public String toString() {
        return "SmartDevice{" +
                "pantalla='" + pantalla + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", sistemaOp='" + sistemaOp + '\'' +
                ", botones=" + botones +
                '}';
    }
}
