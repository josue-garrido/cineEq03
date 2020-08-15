/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import configuraciones.conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elvis
 */
public class usuarioDAO {
    
    Connection con;
    conexion cn= new conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public List <usuario> listarU(String conSQL){
        
     
        
        List<usuario> usuario = new ArrayList();
        
        try{
            con = cn.getConnection();
            ps= con.prepareStatement(conSQL);
            rs=ps.executeQuery();
            while(rs.next()){
                usuario u = new usuario();
                u.setId_usuario(rs.getInt("id_uduario"));
                u.setU_privilegio(rs.getInt("u_privilegio"));
                u.setU_nombre(rs.getString("u_nombre"));
                u.setU_user(rs.getString("u_user"));
                u.setEmail(rs.getString("email"));
                u.setPassword(rs.getString("password"));
                usuario.add(u);
            }
            ps.close();
            rs.close();
        }catch(Exception e){ 
            System.out.println("error en listar el dato");
            System.out.println(e.getMessage());
            
        }
        return usuario;
    }
    
    
    public boolean add(usuario us){
        String sql="insert into usuario(u_privilegio,u_nombre,u_user,email,password) values "
                + "('"+us.getU_privilegio()+"','"+us.getU_nombre()+"','"+us.getU_user()+"','"+us.getEmail()+"','"+us.getPassword()+"')";
    try{
        con=cn.getConnection();
        ps=con.prepareStatement(sql);
        ps.executeUpdate();
        
    }catch(Exception e){
        
    }
    return false;
    }
    
}
