<%-- 
    Document   : agregar
    Created on : 14/08/2020, 11:25:28 PM
    Author     : elvis
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"  crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <h1> agregar usuario</h1>
            
            <form action="" method="post" class="form-control" style="width:500px; height: 500px">
                privilegio<input type="text" name="u_privilegio" class="form-control"><br>
                nombre:<input type="text" name="u_nombre" class="form-control"><br>
                nombre usuario:<input type="text" name="u_user" class="form-control"><br>
                email:<input type="email" name="email" class="form-control"><br>
                contraseña:<input type="password" name="password" class="form-control"><br>
                <input type="submit" name="agregar" value="agregar" class="btn btn-primary btn-lg"><br>
                
            </form>
            
            
            
            
        </div>
    </body>
</html>
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
       
            String u_privilegio,u_nombre,u_user,email,password;
            u_privilegio=request.getParameter("u_privilegio");
            u_nombre=request.getParameter("u_nombre");
            u_user=request.getParameter("u_user");
            email=request.getParameter("email");
            password=request.getParameter("password");
            

            if(u_nombre!=null && u_user!=null&&email!=null){
                ps=con.prepareStatement("insert into usuario(u_privilegio,u_nombre,u_user,email,password)values ("+u_privilegio+",'"+u_nombre+"','"+u_user+"','"+email+"','"+password+"')");
                ps.executeUpdate();
                response.sendRedirect("registroU.jsp");
            }
        %>