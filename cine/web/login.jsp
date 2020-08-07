
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Loging</title>
        <link href="css/estilo.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div id="cuadro">
            <script src="js/validacion.js"></script>
            <form id="formulario" method="post" action="" onsubmit="">
                <p id="titulo"> INICIAR SESION</p>
                <hr>
                <br/><br/>
                <label id="subtitulousuario">NOMBRE DE USUARIO</label>
                <br/><br/>
                <input type="text" name="usuario"id="usuario" class="entrada"/>
                <br/><br/>
                <label id="subtitulopassword">CONTRASEÑA</label>
                <br/><br/>
                <input type="password" name="password" id="password" class="entrada"/>
                <br/><br/>
                <input type="submit" value="iniciar sesion" id="boton">
            
            
                
                    
            </form>
        </div>
    </body>
</html>
