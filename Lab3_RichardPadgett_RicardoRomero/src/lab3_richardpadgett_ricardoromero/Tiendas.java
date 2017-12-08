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
public class Tiendas extends Locales{
    private int tamaño;

    public Tiendas() {
        super();
    }

    public Tiendas(int tamaño, String nombre, int piso) {
        super(nombre, piso);
        setTamaño(tamaño);
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
        if (tamaño < 18) {
            this.tamaño = tamaño;
        }
    }

    @Override
    public String toString() {
        return "Tiendas{" + "tama\u00f1o=" + tamaño + '}';
    }
}
