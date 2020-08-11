/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elvis
 */
import java.sql.*;
import java.util.*;
public class accionesu {
    public static Connection getConnection(){


        String url,username,password;
        url="jdbc:mysql:3306/localhost/cine";
        username="root";
        password="gadejo96123";
        Connection con = null;
        try{
       Class.forName("com.mysql.jdbc.Driver");
       con = DriverManager.getConnection(url,username,password);
       System.out.println("si conecto con la base de datos");

        }
        catch(Exception e){
            System.out.println("no conecto con la base de datos");
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
        
        return con;
    }
    public static int guardar(usuario e){
        int estatus=0;
        try{
            Connection con = accionesu.getConnection();
             String q = "insert into registrou(nombre,ape_pat,ape_mat,edad,correo,password) "
                    + "values(?,?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(q);
            
            //get o set
            ps.setString(1, e.getNombre());
            ps.setString(2, e.getApe_pat());
            ps.setString(3, e.getApe_mat());
            ps.setString(4,e.getEdad());
            ps.setString(5,e.getCorreo());
            ps.setString(6,e.getPassword());
            
            estatus= ps.executeUpdate();
            con.close();
        }catch(Exception ex){
           System.out.println("no se conecto con la tabla");
           System.out.println(ex.getMessage());
           System.out.println(ex.getStackTrace());
        }
        return estatus;
    }
 }
