package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import VO.Cliente;


public class ClienteDAO implements IBaseDatos<Cliente> {

    public Cliente buscar(int id) throws SQLException {
        Cliente resultado = null;
        String query = "Select * from Cliente Where idCliente =" + id;
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id_c = 0;
            String nombre = null;
            String direccion = null;
         

            if (rs.next()) {

                id_c = rs.getInt("idCliente");

                nombre = rs.getString("nombre");

                direccion = rs.getString("direccion");

                resultado = new Cliente(nombre, id_c, direccion);

            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener Cliente");
            e.printStackTrace();
        }
        return resultado;
    }

 
    public List BuscarTodo() throws SQLException {
        
        return null ;

    }

    public boolean insertar(Cliente t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Cliente(idCliente,nombre,direccion ) values (?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getIdCliente());
            preparedStmt.setString(2, t.getNombre());
            preparedStmt.setString(3, t.getDireccion());
            
            result = preparedStmt.execute();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public boolean actualizar(Cliente t) throws SQLException {
        return false;
       
    }

    

    public boolean borrar(Cliente t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
}

