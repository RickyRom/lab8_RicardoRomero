/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3_richardpadgett_ricardoromero;

/**
 *
 * @author ricky
 */
public class Productos {
    private int precio;
    private String descripcion;
    private String marca;
    private int descuento;

    public Productos() {
    }

    public Productos(int precio, String descripcion, String marca, int descuento) {
        this.precio = precio;
        this.descripcion = descripcion;
        this.marca = marca;
        this.descuento = descuento;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return descripcion;
    }
}
