/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.carrito;
import modelo.producto;
import modelo.productoDAO;

/**
 *
 * @author elvis
 */
public class controlador extends HttpServlet {

    productoDAO pdao= new productoDAO();
    producto p=new producto();
    List<producto> producto=new ArrayList();
    
    List<carrito>listaCarrito=new ArrayList<>();
    int item;
    double totalpagar=0.0;
    int cantidad=1;
    
    int idp;
    carrito car;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion=request.getParameter("accion");
        producto = pdao.listar();
        switch (accion){
            case "comprar":
                totalpagar=0.0;
                idp=Integer.parseInt(request.getParameter("id"));
                p=pdao.listarId(idp);
                item=item+1;
                car=new carrito();
                car.setItem(item);
                car.setId_producto(p.getId());
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setPreciocompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad*p.getPrecio());
                listaCarrito.add(car);
                for(int i=0;i<listaCarrito.size(); i++){
                        totalpagar=totalpagar+listaCarrito.get(i).getSubtotal();
                        
                    }
                request.setAttribute("totalpagar",totalpagar);
                request.setAttribute("carrito", listaCarrito);
                request.setAttribute("contador",listaCarrito.size());
                
                request.getRequestDispatcher("carrito.jsp").forward(request,response);
                
            break;
            case "Agregarcarrito":
                idp=Integer.parseInt(request.getParameter("id"));
                p=pdao.listarId(idp);
                item=item+1;
                car=new carrito();
                car.setItem(item);
                car.setId_producto(p.getId());
                car.setNombre(p.getNombre());
                car.setDescripcion(p.getDescripcion());
                car.setPreciocompra(p.getPrecio());
                car.setCantidad(cantidad);
                car.setSubtotal(cantidad*p.getPrecio());
                listaCarrito.add(car);
                
                request.setAttribute("contador",listaCarrito.size());
                request.getRequestDispatcher("controlador?accion=home").forward(request,response);
                
                break;
            case "carrito":
                    totalpagar=0.0;
                    request.setAttribute("carrito",listaCarrito);
                    request.getRequestDispatcher("carrito.jsp").forward(request,response);
                    for(int i=0;i<listaCarrito.size(); i++){
                        totalpagar=totalpagar+listaCarrito.get(i).getSubtotal();
                        
                    }
                    request.setAttribute("totalpagar",totalpagar);
                    request.getRequestDispatcher("index.jsp").forward(request,response);
            break;
            default:
                request.setAttribute("producto",producto);
                request.getRequestDispatcher("index.jsp").forward(request, response);
            
          }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
