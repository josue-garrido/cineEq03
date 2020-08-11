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
import java.io.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
/**
 *
 * @author elvis
 */
public class agregaru extends HttpServlet {

    //conexion con la base de datos
    private Connection con; //objeto para establecer la conexion con bd
    private Statement set; //es para poder prepara la querry (insert,alter, create, drop)
    //toda la preparacion de la querry
    private ResultSet rs; //el objeto para poder realizar consultas (select)
    
    //metodo para poder realizar la inicializacion de la conexion bd 
    
    
    
    //este es el metodo para la conexion con la base de datos al momento que se inicializa el servlet
    public void init(ServletConfig cfg) throws ServletException{
       String URL = "jdbc:mysql:3306//localhost/cine";
       //usuario de la bd
       String userName = "root";
       //usuario
       String password = "gadejo96123";
       try{
           //colocar el driver de la conexion mysql,sql,firebase, con el manejador a ocupar
           Class.forName("com.mysql.jdbc.Driver");
           //uso de los objetos de con y set
           con=DriverManager.getConnection(URL,userName,password);
              //con set preparamos la sentencia
           set = con.createStatement();
        
           System.out.println("Coneto con la BD");
       }catch(Exception e){
           System.out.println("No conecto con la BD");
           System.out.println(e.getMessage());
           System.out.println(e.getStackTrace());
       } 
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet agregaru</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet agregaru at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
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
