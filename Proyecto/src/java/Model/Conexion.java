
package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    Connection cn = null;
    public Connection getConnection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            cn = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "admin");
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error:" + e);
        }
        return cn;
    }
}
