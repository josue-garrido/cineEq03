/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package configuraciones;

/**
 *
 * @author elvis
 */
import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    Connection con;
    String url="jdbc:mysql://localhost:3306/proyectocine";
    String user ="root";
    String pass = "gadejo96123";
    
    public Connection getConnection(){
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            System.out.println("conectado a la bd");
        }catch(Exception e){
            System.out.println("error al conectar con la bd");
        }
            return con;
    }
    /*
    public static void main(String args[]){
        conexion c=new conexion();
        System.out.println(""+c.getConnection());
    }
    */
}
