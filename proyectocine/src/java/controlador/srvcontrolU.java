package controlador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import configuraciones.conexion;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;
import modelo.usuarioDAO;

/**
 *
 * @author elvis
 */
public class srvcontrolU extends HttpServlet {
    usuarioDAO udao= new usuarioDAO();
    usuario u=new usuario();
    List<usuario> usuario=new ArrayList();
    
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */String add="web Pages/add.jsp";
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        usuarioDAO us=new usuarioDAO();
        if(request.getParameter("buscar")!=null){
            
            List<usuario> lista = us.listarU("select id_usuario, u_privilegio,u_nombre,u_user,"
                    + "email,password from usuario where ='"+request.getParameter("id_usuario")+"';");
            for(int i=0; i<lista.size();i++){
                response.sendRedirect("registroU.jsp?id_usuario="+lista.get(i).getId_usuario()+"&u_privilegio="+lista.get(i).getU_privilegio() +
                        "&u_nombre="+lista.get(i).getU_nombre()+"&u_user="+lista.get(i).getU_user()
                +"&email="+lista.get(i).getEmail()+"&password="+lista.get(i).getPassword());
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
        String acceso="";
        String action = request.getParameter("accion");
        if(action.equalsIgnoreCase("add")){
            acceso=add;
        }else if(action.equalsIgnoreCase("agregar")){
            String u_privilegio=request.getParameter("u_privilegio");
            String u_nombre=request.getParameter("u_nombre");
            String u_user=request.getParameter("u_user");
            String email=request.getParameter("email");
            String password=request.getParameter("password");
            
            u.setU_privilegio( u.getU_privilegio());
            u.setU_nombre(u_nombre);
            u.setU_user(u_user);
            u.setEmail(email);
            u.setPassword(password);
            udao.add(u);
        }
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
