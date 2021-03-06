<%-- 
    Document   : index
    Created on : 13/08/2020, 11:34:40 AM
    Author     : elvis
--%>

    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8" import="controlador.*"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"  crossorigin="anonymous">
    </head>
    <body>
        
         <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">pelis icel</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="controlador?accion=home">Home <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="#">ofertas</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="controlador?accion=carrito"><i class="fas fa-cart-plus">(<label style="color: orange">${contador}</label>)</i>Carrito</a>
                </li>
                <li class="nav-item">
                  <a class="nav-link" href="registroU.jsp"  >menu</a>
                </li>
                <li class="nav-item dropdown">
                  <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                    Iniciar Sesion
                  </a>
                  <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                    <a class="dropdown-item" href="#">Action</a>
                    <a class="dropdown-item" href="#">Another action</a>
                    <div class="dropdown-divider"></div>
                    <a class="dropdown-item" href="#">Something else here</a>
                  </div>
                </li>
              </ul>
              <form class="form-inline my-2 my-lg-0">
                <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
              </form>
                
              </div>
          </nav>  
        <div class="container mt-2">
            <div class="row">
                <c:forEach var="p" items="${producto}">
                <%--<% for(int i=0; i<=10;i++){ %>--%>
                      <div class="col-sm-4">
                        <div class="card-header">
                            <label>${p.getNombre()}</label>
                        </div>
                        <div class="card-body">
                            <i>$.${p.getPrecio()}</i>
                            <img src="controladorIMG?id=${p.getId()}" width="200" height="180">
                            
                        </div>
                        <div class="card-footer text-center">
                            <label>${p.getDescripcion}</label>
                            <div>
                                <a href="controlado?accion=Agregarcarrito&id=${p.getId()}" class="btn btn-outline-info"> agregar a carrito</a>
                                <a href="#" class="btn-btn-danger"> comprar</a>

                            </div>
                        </div>
                    </div>
                  <%--<%}%>  --%>      
                 </c:forEach>
            
           </div>
        </div>
    </body>
</html>
