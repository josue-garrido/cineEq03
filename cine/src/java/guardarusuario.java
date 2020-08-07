/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author elvis
 */
public class guardarusuario extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String nombre,ape_pat,ape_mat,edad,correo,password;
            nombre = request.getParameter("nombre");
            ape_pat = request.getParameter("ape_pat");
            ape_mat = request.getParameter("ape_mat");
            edad = request.getParameter("edad");
            correo = request.getParameter("correo");
            password = request.getParameter("password");
            
            //instancia del usuario
            usuario e=new usuario();
            e.setNombre(nombre);
            e.setApe_pat(ape_pat);
            e.setApe_mat(ape_mat);
            e.setEdad(edad);
            e.setCorreo(correo);
            e.setPassword(password);
            
            
            //guarda el usuario
            int estatus = accionesu.guardar(e);
            if(estatus>0){
                
            
            
           
            
           
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Guardar usuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Dato Guardado </h1>");
            out.println("</body>");
            out.println("</html>");
        } else{
                
                /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Guardar usuario</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>no se guardo el dato </h1>");
            out.println("</body>");
            out.println("</html>");
                }
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
