package Modelo;

import Modelo.IBaseDatos;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import VO.Vendedor;


public class VendedorDAO implements IBaseDatos<Vendedor> {

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Vendedor Buscar(int IdVendedor) throws SQLException {
        Vendedor resultado = null;
        String query = "Select * from Vendedor Where IdVendedor ='" + IdVendedor + "'";
        System.out.println(query);
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            int idcaja = 0;
            String nombre = null;
            int ProdVend = 0;
            double Porcen = 0.0;
            if (rs.next()) {
                
                id = rs.getInt("IdVendedor");
                
                
                idcaja = rs.getInt("idCaja");
                resultado.setIdVendedor(id);
                
                nombre = rs.getString("nombre");
                resultado.setNombre(nombre);
                
               
                ProdVend = rs.getInt("Productos_Vend");
                
               
                Porcen = rs.getDouble("Porcentaje");

                resultado = new Vendedor(nombre, IdVendedor, query, nombre, ProdVend, Porcen);

            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener Vendedor");
            e.printStackTrace();
        }
        return resultado;
    }

   
    public List BuscarTodo() throws SQLException {
        return null;

    }


    public boolean insertar(Vendedor t) throws SQLException {
        
        return false;

    }


    public boolean actualizar(Vendedor t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public boolean borrar(Vendedor t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public List ConsulVe_vent() throws SQLException {
        List<Vendedor> vendedores = null;
        String query = "SELECT ventas.idvendedor,vendedor.nombre, COUNT(*)as total\n"
                + "from vendedor inner join ventas on(vendedor.idvendedor=ventas.idvendedor)\n"
                + "group by vendedor.idvendedor;";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int id = 0;
            int tot = 0;
            String nombre = null;
         
            int productos_v = 0;
            while (rs.next()) {
                if (vendedores == null) {
                    vendedores = new ArrayList<Vendedor>();
                }
                Vendedor registro = new Vendedor(nombre, id, query, nombre, productos_v, Double.NaN);
                id = rs.getInt("idVendedor");
                registro.setIdVendedor(id);
                tot = rs.getInt("Productos_Vend");
                registro.setProductos_vend(productos_v);
                nombre=rs.getString("nombre");
                registro.setNombre(nombre);
                
                System.out.println(registro.getProductos_vend());
                vendedores.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Productos vendidos");
            e.printStackTrace();
        }

        return vendedores;
    }


}

