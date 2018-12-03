package VO;


public class Producto {
    
    private String nombre;
    private int codigobarras;
    private int cantidad;
    private float precio;
    private double porcentaje;

    public Producto(int codigobarras,String nombre, int cantidad, float precio) {
     
        this.codigobarras = codigobarras;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigobarras() {
        return codigobarras;
    }

    public void setCodigobarras(int codigobarras) {
        this.codigobarras = codigobarras;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

   
}

