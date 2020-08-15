<%-- 
    Document   : registroU
    Created on : 14/08/2020, 04:40:34 PM
    Author     : elvis
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8" import="configuraciones.conexion"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"  crossorigin="anonymous">
    </head>
    <body>
        <% 
            Connection con;
            String url="jdbc:mysql://localhost:3306/proyectocine";
            String user ="root";
            String pass = "gadejo96123";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
            

       
           
            PreparedStatement ps;
            ResultSet rs;
            ps=con.prepareStatement("select *from usuario");
            rs=ps.executeQuery();
       
        %>
        <div class="container mt-2">
            <h1>Lista de Registro</h1>
            
            <a class="btn btn-outline-success " href="agregar.jsp"> Nuevo Registro</a>
            <table  class="table table-hover">
                    <tr>
                            <th>id</th>
                            <th>privilegio</th>
                            <th>nombre</th>
                            <th>user</th>
                            <th>email</th>
                            <th>passwrod</th>
                    </tr>
                    <% 
                            while(rs.next()){      
                    %>   
                    <tr>
                         <th><%=rs.getInt("id_usuario")%></th>
                            <th><%=rs.getInt("u_privilegio")%></th>
                            <th><%=rs.getString("u_nombre")%></th>
                            <th><%=rs.getString("u_user")%></th>
                            <th><%=rs.getString("email")%></th>
                            <th><%=rs.getString("password")%></th>
                            <th>
                                <a href="editar.jsp?id<%=rs.getInt("id_usuario")%>" class="btn btn-outline-info">editar</a>
                                <a href="delit.jsp?id<%=rs.getInt("id_usuario")%>" class="btn btn-outline-info">eliminar</a>
                            </th>
                    </tr>
                    <% } %>
            </table>       
        </div>
        
        
    </body>
</html>
