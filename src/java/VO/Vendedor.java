package VO;

public class Vendedor {

    private String nombre;
    private Integer IdVendedor;
    private String usuario;
    private String clave;
    private int productos_vend;
    private Double porcentaje;

    public Vendedor(String nombre, Integer IdVendedor, String usuario, String clave, int productos_vend, Double porcentaje) {
        this.nombre = nombre;
        this.IdVendedor = IdVendedor;
        this.usuario = usuario;
        this.clave = clave;
        this.productos_vend = productos_vend;
        this.porcentaje = porcentaje;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getIdVendedor() {
        return IdVendedor;
    }

    public void setIdVendedor(Integer IdVendedor) {
        this.IdVendedor = IdVendedor;
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

    public int getProductos_vend() {
        return productos_vend;
    }

    public void setProductos_vend(int productos_vend) {
        this.productos_vend = productos_vend;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    

}

