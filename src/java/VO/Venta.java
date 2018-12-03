package VO;

import java.util.List;
import java.time.LocalDate;

public class Venta {

    private int IdCompra;
    private double valor;
    private Cliente cliente;
    private Vendedor vendedor;
    private Caja caja;
    private LocalDate data;
    private int CodigoBarras; 

    public Venta(int IdCompra,int CodigoBarras, double valor, Cliente cliente, Vendedor vendedor, Caja caja, LocalDate data) {
        this.IdCompra = IdCompra;
        this.valor = valor;
        this.cliente = cliente;
        this.vendedor = vendedor;
        this.caja = caja;
        this.data = data;
        this.CodigoBarras= CodigoBarras;
    }

    public int getCodigoBarras() {
        return CodigoBarras;
    }

    public void setCodigoBarras(int CodigoBarras) {
        this.CodigoBarras = CodigoBarras;
    }

    public int getIdCompra() {
        return IdCompra;
    }

    public void setIdCompra(int IdCompra) {
        this.IdCompra = IdCompra;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    

}

