package VO;

public class Administrador {

    private int IdAdmin;
    private String usuario;
    private String clave;
    private String nombre;

    public Administrador() {
        this.IdAdmin = IdAdmin;
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
    }
    

    public int getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(int IdAdmin) {
        this.IdAdmin = IdAdmin;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

}