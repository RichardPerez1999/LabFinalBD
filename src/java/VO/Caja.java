package VO;

//import Controlador.MercadoControlador;
import javafx.collections.ObservableList;


public class Caja {

    private int IdCaja;
    private double DineroCaja;
    private int IdPunto;
    //private MercadoControlador controlador=null;
    

    public int precioTotal(int cantidad, float precio){
        int conv = (int)precio;
        return cantidad*conv;
        
    }

   /* public void setMercadoControlador(MercadoControlador controlador) {
        this.controlador=controlador;
    }*/
    
}
