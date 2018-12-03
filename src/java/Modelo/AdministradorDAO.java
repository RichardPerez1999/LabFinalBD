package Modelo;

import Util.DbUtil;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import VO.Administrador;


public class AdministradorDAO {

    private Connection connection;

    public AdministradorDAO() {
        connection = DbUtil.getConnection();
    }

    public Administrador validar(Administrador  admin){
        
        System.out.println("hola");

        try {
            
            PreparedStatement preparedStatenment = null;
            String consulta = "SELECT * FROM  ADMINISTRADOR WHERE usuario=? AND clave=?";
            PreparedStatement PreparedStatement = connection.prepareStatement(consulta);
            PreparedStatement.setString(1, admin.getUsuario());
            PreparedStatement.setString(2, admin.getClave());
            ResultSet rs = preparedStatenment.executeQuery();
            if (rs.next()){
                int id = rs.getInt("IdAdmin");
                String login = rs.getString("usuario");
                String pass = rs.getString("clave");
                String nombre = rs.getString("nombre");
                Administrador sesion = new Administrador();
                
                sesion.setUsuario(login);
                sesion.setClave(pass);
                sesion.setIdAdmin(id);
                sesion.setNombre(nombre);
                System.out.println(id);
                System.out.println(login);
                System.out.println(pass);
                System.out.println(nombre);
                return sesion;
            }
            else{
                return null;
            }
           
        } catch (SQLException e) {
            e.printStackTrace();
        }
     
        return null;
    }

}



