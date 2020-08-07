<%-- 
    Document   : registrou
    Created on : 6/08/2020, 10:58:19 AM
    Author     : elvis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <body>
        <div id="cuadro">
            <script src=""></script>
            <form id="formregistrou" method="post" action="guardarusuario" onsubmit="">
                <p id="titulo"> REGISTRO USUARIO</p>
                <hr>
                <br/><br/>
                <label id="subtitulousuario">NOMBRE DE USUARIO:</label>
                <br/><br/>
                <input type="text" name="usuario"id="usuario" class="entrada"/>
                <br/><br/>
                <label id="subtitulousuario">NOMBRE:</label>
                <br/><br/>
                <input type="text" name="nombre"id="nombre" class="entrada"/>
                <br/><br/>
                <label id="subtitulousuario">APELLIDO PATERNO:</label>
                <br/><br/>
                <input type="text" name="ape_pat"id="ape_pat" class="entrada"/>
                <br/><br/>
                <label id="subtitulousuario">APELLIDO MATERNO:</label>
                <br/><br/>
                <input type="text" name="ape_mat"id="ape_mat" class="entrada"/>
                <br/><br/>
                <label id="subtitulousuario">EDAD:</label>
                <br/><br/>
                <input type="text" name="edad"id="edad" class="entrada"/>
                <br/><br/>
                <label id="subtitulousuario">CORREO:</label>
                <br/><br/>
                <input type="text" name="correo"id="correo" class="entrada"/>
                <br/><br/>
                <label id="subtitulopassword">CONTRASEÑA</label>
                <br/><br/>
                <input type="password" name="password" id="password" class="entrada"/>
                <br/><br/>
                <input type="submit" value="registar usuario" id="boton">
                <input type="submit" value="Guardar" id="boton">
            
                
                    
            </form>
        </div>
    </body>
</html>
