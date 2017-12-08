
package lab3_richardpadgett_ricardoromero;

import java.util.ArrayList;

public class Clientes extends Personas{
    String productocomp;
    int dinero;
    ArrayList <Productos> factura = new ArrayList();

    public Clientes() {
    }

    public Clientes(String productocomp, int dinero, String user, String passw, String email, String nombrec, String id, String fechan) {
        super(user, passw, email, nombrec, id, fechan);
        this.productocomp = productocomp;
        this.dinero = dinero;
    }

    public String getProductocomp() {
        return productocomp;
    }

    public void setProductocomp(String productocomp) {
        this.productocomp = productocomp;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Productos> getFactura() {
        return factura;
    }

    public void setFactura(ArrayList<Productos> factura) {
        this.factura = factura;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassw() {
        return passw;
    }

    public void setPassw(String passw) {
        this.passw = passw;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombrec() {
        return nombrec;
    }

    public void setNombrec(String nombrec) {
        this.nombrec = nombrec;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFechan() {
        return fechan;
    }

    public void setFechan(String fechan) {
        this.fechan = fechan;
    }

    @Override
    public String toString() {
        return "Clientes{" + "productocomp=" + productocomp + ", dinero=" + dinero + ", factura=" + factura + '}';
    }
}
