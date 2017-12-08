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
public class Juguetes extends Productos{
    private String juguete;
    
    public Juguetes() {
        super();
    }

    public Juguetes(String juguete, int precio, String descripcion, String marca, int descuento) {
        super(precio, descripcion, marca, descuento);
        this.juguete = juguete;
    }

    public String getJuguete() {
        return juguete;
    }

    public void setJuguete(String juguete) {
        this.juguete = juguete;
    }

    @Override
    public String toString() {
        return "Juguetes{" + "juguete=" + juguete + '}';
    }

    
}
