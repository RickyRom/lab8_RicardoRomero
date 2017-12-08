
package lab3_richardpadgett_ricardoromero;


public class Personas {
    String user;
    String passw;
    String email;
    String nombrec;
    String id;
    String fechan;

    public Personas() {
    }

    public Personas(String user, String passw, String email, String nombrec, String id, String fechan) {
        this.user = user;
        this.passw = passw;
        this.email = email;
        this.nombrec = nombrec;
        this.id = id;
        this.fechan = fechan;
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
        return "Personas{" + "user=" + user + ", passw=" + passw + ", email=" + email + ", nombrec=" + nombrec + ", id=" + id + ", fechan=" + fechan + '}';
    }
    
}
