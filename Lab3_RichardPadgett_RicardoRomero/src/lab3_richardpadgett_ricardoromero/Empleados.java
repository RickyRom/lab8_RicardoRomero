
package lab3_richardpadgett_ricardoromero;


public class Empleados extends Personas {
    int horariot;
    int productov;

    public Empleados() {
    }

    public Empleados(int horariot, int productov) {
        this.horariot = horariot;
        this.productov = productov;
    }

    public Empleados(int horariot, int productov, String user, String passw, String email, String nombrec, String id, String fechan) {
        super(user, passw, email, nombrec, id, fechan);
        this.horariot = horariot;
        this.productov = productov;
    }

    public int getHorariot() {
        return horariot;
    }

    public void setHorariot(int horariot) {
        this.horariot = horariot;
    }

    public int getProductov() {
        return productov;
    }

    public void setProductov(int productov) {
        this.productov = productov;
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
        return "Empleados{" + "horariot=" + horariot + ", productov=" + productov + '}';
    }
    
    
}
