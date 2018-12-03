package Modelo;

import VO.ProductoVendido;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductoVendidoDAO implements IBaseDatos<ProductoVendido> {
         
         
    public ProductoVendido Buscar(int CodigoBarras) throws SQLException {
        ProductoVendido resultado = null;
        String query = "Select * from ProductoVendido Where CodigoBarras =" + CodigoBarras;
        Connection connection = Conexion.getConnection();
        
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
         
            int codigobarras = 0;
            int cantidad = 0;
            int PrecioTotal = 0;

            if (rs.next()) {
                
                
                
                codigobarras = rs.getInt("CodigoBarras");
                
                cantidad = rs.getInt("cantidad");
                
                PrecioTotal = rs.getInt("PrecioTotal");
                
                resultado = new ProductoVendido( codigobarras, cantidad, PrecioTotal);
                

            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener el producto vendido");
            e.printStackTrace();
        }
        return resultado;
    }

    
    public List<ProductoVendido> BuscarTodo() throws SQLException {
        System.out.println("dao");
        List<ProductoVendido> ProductoVendidos = null;
        String query = "Select * from ProductoVendido ";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            
            int codigobarras = 0;
            int cantidad = 0;
            int PrecioTotal = 0;
            
            while (rs.next()) {
                if (ProductoVendidos == null) {
                    ProductoVendidos = new ArrayList<ProductoVendido>();
                }

                ProductoVendido registro = null;
               
              
                
                codigobarras = rs.getInt("CodigoBarras");
                registro.setCodigobarras(codigobarras);
              
                cantidad = rs.getInt("Cantidad");
                registro.setCantidad(cantidad);
                
                PrecioTotal = rs.getInt("PrecioTotal");
                registro.setPrecioTotal(PrecioTotal);

                registro = new ProductoVendido(codigobarras, cantidad,PrecioTotal );
                ProductoVendidos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Productos Vendidos");
            e.printStackTrace();
        }

        return ProductoVendidos;

    }

  
    public boolean insertar(ProductoVendido t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into ProductoVendido(codigobarras, cantidad,PrecioTotal ) values (?,?,?)";
        PreparedStatement preparedStmt = null;
        
        try {
            preparedStmt = connection.prepareStatement(query);
          
            preparedStmt.setInt(1, t.getCodigobarras());
            preparedStmt.setInt(2, t.getCantidad());
            preparedStmt.setInt(3, t.getPrecioTotal());
          
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }


    public boolean actualizar(ProductoVendido t) throws SQLException {
       
        return false;

    }


    @Override
    public boolean borrar(ProductoVendido t) throws SQLException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

 
    
}
    


