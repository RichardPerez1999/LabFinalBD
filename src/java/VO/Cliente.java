package VO;

public class Cliente{
    private String Nombre;
    private int IdCliente;
    private String Direccion;

    public Cliente(String Nombre, int IdCliente, String Direccion) {
        this.Nombre = Nombre;
        this.IdCliente = IdCliente;
        this.Direccion = Direccion;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }
    

    

    
    
}

