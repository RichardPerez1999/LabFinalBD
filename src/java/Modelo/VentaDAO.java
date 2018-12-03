package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import VO.*;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;


public class VentaDAO implements IBaseDatos<Venta> {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Venta Buscar(int id) throws SQLException {
        return null;
   
    }

    @Override
    public List BuscarTodo() throws SQLException {
        return null;
      
    }


    @Override
    public boolean insertar(Venta t) throws SQLException {
        return false;
    
    }

    
    @Override
    public boolean actualizar(Venta t) throws SQLException {
        return false;
       
    }

    

   

    
    @Override
    public boolean borrar(Venta t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
