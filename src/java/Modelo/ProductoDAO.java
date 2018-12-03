package Modelo;

import VO.Producto;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ProductoDAO implements IBaseDatos<Producto> {
         
         
    public Producto Buscar(int CodigoBarras) throws SQLException {
        Producto resultado = null;
        String query = "Select * from Producto Where CodigoBarras =" + CodigoBarras;
        Connection connection = Conexion.getConnection();
        
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            
            int codigobarras = 0;
            String nombre = null;
            float precio = 0;
            int cantidad = 0;

            if (rs.next()) {
               
                codigobarras = rs.getInt("CodigoBarras");

                nombre = rs.getString("nombre");

                cantidad = rs.getInt("CantidadInv");
                
                precio = rs.getFloat("precio");
                
                resultado = new Producto(codigobarras, nombre, cantidad, precio);
                

            }
            st.close();
        } catch (SQLException e) {
            System.out.println("Problemas al obtener persona");
            e.printStackTrace();
        }
        return resultado;
    }

    @Override
    public List<Producto> BuscarTodo() throws SQLException {
        Producto registro = null;
        List<Producto> productos = null;
        String query = "Select * from Producto ";
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int codigobarras = 0;
            String nombre = "";
            float precio = 0;
            int cantidad = 0;
            while (rs.next()) {
                if (productos == null) {
                    productos = new ArrayList<Producto>();
                }

                
                codigobarras = rs.getInt("CodigoBarras");
              
                nombre = rs.getString("Nombre");
                
                precio = rs.getFloat("Precio");
              
                cantidad = rs.getInt("CantidadInv");
               

                registro = new Producto(codigobarras, nombre, cantidad, precio);
                productos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return productos;

    }

    @Override
    public boolean insertar(Producto t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query = " insert into Producto(CodigoBarras,Nombre,CantidadInv,Precio ) values (?,?,?,?)";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCodigobarras());
            preparedStmt.setString(2, t.getNombre());
            preparedStmt.setInt(3, t.getCantidad());
            preparedStmt.setFloat(4,t.getPrecio() );
          
            result = preparedStmt.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public boolean actualizar(Producto t) throws SQLException {
        boolean result = false;
        Connection connection = Conexion.getConnection();
        String query
                = "update Producto set cantidad where codigobarras = ?";
        PreparedStatement preparedStmt = null;
        try {
            preparedStmt = connection.prepareStatement(query);
            preparedStmt.setInt(1, t.getCodigobarras());
            preparedStmt.setString(2, t.getNombre());
            preparedStmt.setDouble(3, t.getPrecio());
            preparedStmt.setInt(4, t.getCantidad());
           

            if (preparedStmt.executeUpdate() > 0) {
                result = true;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;

    }
/*
    public List ConsulProdVendidos() throws SQLException {
        System.out.println("asdasd");
        List<Producto> productos = null;
        System.out.println("sadsada");
        String query = "SELECT Venta.CodigoBarras,Producto.Nombre, sum(Venta.CantidadComp) as Cantidad ,\n"
                + "(select sum(Venta.CantidadComp)*100/(select sum(Venta.CantidadComp)from Venta\n"
                + "inner join Producto on(Venta.CodigoBarras = Producto.CodigoBarras) ) )as porcentaje\n"
                + "FROM Venta inner join Producto on(Venta.CodigoBarras = Producto.CodigoBarras)\n"
                + "group by Venta.CodigoBarras ";
        System.out.println(query);
        Connection connection = Conexion.getConnection();
        try {
            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);
            int CodigoBarras = 0;
            String nombre = null;
            int cantidad = 0;
            float porcen = 0;
            while (rs.next()) {
                if (productos == null) {
                    productos = new ArrayList<Producto>();
                }

                Producto registro;
                registro = new Producto(nombre, cantidad, cantidad, CodigoBarras);
                CodigoBarras = rs.getInt("id_producto");
                registro.setCodigobarras(CodigoBarras);
                nombre = rs.getString("nombre");
                registro.setNombre(nombre);
                cantidad = rs.getInt("cantidad");
                porcen=rs.getFloat("porcentaje");
                registro.setCantidad(cantidad);
                registro.setPorcentaje(porcen);
                productos.add(registro);
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Departamentos");
            e.printStackTrace();
        }

        return productos;

    }
*/
 
    public boolean   borrar(Producto t) throws SQLException {
     boolean result=false;
	   Connection connection = Conexion.getConnection();
	   String query = "delete from Producto where Codigobarras = ?";
	   PreparedStatement preparedStmt=null;
	   try {
		     preparedStmt = connection.prepareStatement(query);
		     preparedStmt.setInt(1, t.getCodigobarras());
		    result= preparedStmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	   
	   return result;
	}
    

}


