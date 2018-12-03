package VO;


public class ProductoVendido {
   
    private int codigobarras;
    private int cantidad;
    private int PrecioTotal ;
    

    public ProductoVendido( int codigobarras, int cantidad, int PrecioTotal) {
      
        this.codigobarras = codigobarras;
        this.cantidad = cantidad;
        this.PrecioTotal = PrecioTotal;
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

    public int getPrecioTotal() {
        return PrecioTotal;
    }

    public void setPrecioTotal(int PrecioTotal) {
        this.PrecioTotal = PrecioTotal;
    }
    
}

