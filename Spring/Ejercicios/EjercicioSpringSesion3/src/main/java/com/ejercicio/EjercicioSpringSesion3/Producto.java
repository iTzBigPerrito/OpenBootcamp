package com.ejercicio.EjercicioSpringSesion3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;
    private String nombreProducto;
    private String fabricanteProducto;
    private double precioProducto;
    private boolean descuentoProducto;

    //Constructores
    public Producto() {
    }
    public Producto(Integer idProducto, String nombreProducto, String fabricanteProducto, double precioProducto, boolean descuentoProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.fabricanteProducto = fabricanteProducto;
        this.precioProducto = precioProducto;
        this.descuentoProducto = descuentoProducto;
    }

    // Métodos
    public Integer getIdProducto() {
        return idProducto;
    }
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }
    public String getNombreProducto() {
        return nombreProducto;
    }
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    public String getFabricanteProducto() {
        return fabricanteProducto;
    }
    public void setFabricanteProducto(String fabricanteProducto) {
        this.fabricanteProducto = fabricanteProducto;
    }
    public double getPrecioProducto() {
        return precioProducto;
    }
    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }
    public boolean isDescuentoProducto() {
        return descuentoProducto;
    }
    public void setDescuentoProducto(boolean descuentoProducto) {
        this.descuentoProducto = descuentoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + idProducto +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", fabricanteProducto='" + fabricanteProducto + '\'' +
                ", precioProducto=" + precioProducto +
                ", descuentoProducto=" + descuentoProducto +
                '}';
    }
}