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
public class Ropa extends Productos{
    private String talla;

    public Ropa() {
        super();
    }

    public Ropa(String talla, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.talla = talla;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    @Override
    public String toString() {
        return "Ropa{" + "talla=" + talla + '}';
    }
}
