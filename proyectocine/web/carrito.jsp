<%-- 
    Document   : carrito
    Created on : 13/08/2020, 11:35:53 AM
    Author     : elvis
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>carrito</title>
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
                <%--<li class="nav-item">
                  <a class="nav-link" href="#">ofertas</a>
                </li>--%>
                <li class="nav-item">
                    <a class="nav-link" href="controlador?accion=home">seguir Comprando</a>
                </li>
                <%--<li class="nav-item">
                  <a class="nav-link disabled" href="#" tabindex="-1" aria-disabled="true">Disabled</a>
                </li>--%>
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
                <div class="container mt-4">
                    <h1>Carrito</h1>
                    <br>
                    <div class="row">
                        <div class="col-sm-8">
                            <table class="table table-hover">
                                <thead>
                                    <tr>
                                        <th>ITEM</th>
                                        <th>NOMBRE</th>
                                        <th>DESCRIPCION</th>
                                        <th>PRECIO</th>
                                        <th>CANT</th>
                                        <th>SUBTOTAL</th>
                                        <th>ACCION</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <c:forEach var="car" items="${carrito}">
                                        <tr>
                                        <td>${car.getItem()}</td>
                                        <td>${car.get.Nombre()}</td>
                                        <td>${car.getDescripcion()}
                                            <img src="controladorIMG?id=${car.getId_producto()}" width="100" height="100">
                                                
                                        </td>
                                        <td>${car.getPreciocompra()}</td>
                                        <td>${car.getCantidad()}</td>
                                        <td>${car.getSubtotal()}</td>
                                        <td>
                                            <a href="#">eliminar</a>
                                            <a href="#">editar</a>
                                        </td>
                                    </tr>
                                    </c:forEach>    
                                    
                                </tbody>
                            </table>

                        </div>
                      
                        <div class="col-sm-4">
                            <div class="card">
                                <div class="card-header">
                                    <h3>Generar Compra</h3>
                                </div>
                                <div class="card-body">
                                    <label>subtotal</label>
                                    <input type="text" value="$.${totalpagar}" readonly="" class="form-control" >
                                    <label>Descuento</label>
                                    <input type="text" value="$0.00" readonly="" class="form-control" >
                                    <label>Total pagar </label>
                                    <input type="text" value="$.${totalpagar}0" readonly="" class="form-control" >
                                </div>
                                <div class="card-footer">
                                    <a href="#" class="btn btn-info btn-block">Realiza pago</a>
                                    <a href="#" class="btn btn-danger btn-block">Generear Compra</a>
                                </div>
                            </div>
                        </div>
                    </div> 
                </div>
    </body>
</html>
