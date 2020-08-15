<%-- 
    Document   : editar
    Created on : 15/08/2020, 12:29:49 AM
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
        <% 
            Connection con;
            String url="jdbc:mysql://localhost:3306/proyectocine";
            String user ="root";
            String pass = "gadejo96123";
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url,user,pass);
          
            PreparedStatement ps;
            ResultSet rs;
            int id=Integer.parseInt(request.getParameter("id_usuario"));
            
            ps=con.prepareStatement("select * from usuario where id="+id);
            rs=ps.executeQuery();
            while(rs.next()){
                
           
        %>
        
        <div class="container">
            <h1> Modificar Regristo</h1>
            
            <form action="" method="post" class="form-control" style="width:500px; height: 500px">
                ID<input type="text" readonly="" class="form-control" value="<%= rs.getInt("id_usuario")%>"/><br>
                privilegio<input type="text" name="u_privilegio" class="form-control" value="<%= rs.getInt("id_privilegio")%>"/><br>
                nombre:<input type="text" name="u_nombre" class="form-control" value="<%= rs.getString("u_nombre")%>"/><br>
                nombre usuario:<input type="text" name="u_user" class="form-control" value="<%= rs.getString("u_user")%>"/><br>
                email:<input type="email" name="email" class="form-control" value="<%= rs.getString("email")%>"/><br>
                contraseña:<input type="password" name="password" class="form-control" value="<%= rs.getString("password")%>"/><br>
                <input type="submit" name="agregar" value="agregar" class="btn btn-primary btn-lg"><br>
                
            </form>
            
            <%  }%>
            
            
        </div>
        
        
    </body>
</html>

<%
 String id_usuario,u_privilegio,u_nombre,u_user,email,password;
            id_usuario=request.getParameter("is_usuario");
            u_privilegio=request.getParameter("u_privilegio");
            u_nombre=request.getParameter("u_nombre");
            u_user=request.getParameter("u_user");
            email=request.getParameter("email");
            password=request.getParameter("password");
            

            if(u_nombre!=null && u_user!=null&&email!=null){
                ps=con.prepareStatement("update usuario set id_usuario="+id_usuario+" ,privilegio="+u_privilegio+",nombre='"+u_nombre+"',user='"+u_user+"',email='"+email+"',password='"+password+"' where id_usurario="+id_usuario);
                ps.executeUpdate();
                response.sendRedirect("registroU.jsp");
            }
        %>