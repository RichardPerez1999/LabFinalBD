/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author oem
 */
public class DbUtil {
    
    private static Connection connection = null;
    
  public static Connection getConnection(){
      
      if(connection != null)
          return connection;
      else{
          try {
              String driver = "com.mysql.jdbc.Driver";
              String url = "cjdbc:mysql://localhost:3306/supermercadoxy";
              String user = "root";
              String password = "root";
              Class.forName(driver);
              connection = DriverManager.getConnection(url, user, password);
          } catch (ClassNotFoundException e) {
              e.printStackTrace();
          } catch(SQLException e){
              e.printStackTrace();
          }
          return connection;
      }
  }
        
    
}
