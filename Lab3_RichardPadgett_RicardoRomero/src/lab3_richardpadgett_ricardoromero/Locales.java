
package lab3_richardpadgett_ricardoromero;

import java.util.ArrayList;

public class Locales {
   String nombre;
   int piso;
   ArrayList<Productos> prod = new ArrayList();

    public Locales() {
    }

    public Locales(String nombre, int piso) {
        this.nombre = nombre;
        this.piso = piso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public ArrayList<Productos> getProd() {
        return prod;
    }

    public void setProd(ArrayList<Productos> prod) {
        this.prod = prod;
    }

    @Override
    public String toString() {
        return "Locales{" + "nombre=" + nombre + ", piso=" + piso + ", prod=" + prod + '}';
    }
}
