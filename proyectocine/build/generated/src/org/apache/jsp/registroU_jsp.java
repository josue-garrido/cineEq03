package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;
import configuraciones.conexion;

public final class registroU_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 
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
       
        
      out.write("\n");
      out.write("        <div>\n");
      out.write("            <table>\n");
      out.write("                    <tr>\n");
      out.write("                            <th>id</th>\n");
      out.write("                            <th>nombre</th>\n");
      out.write("                            <th>privilegio</th>\n");
      out.write("                            <th>user</th>\n");
      out.write("                            <th>email</th>\n");
      out.write("                            <th>passwrod</th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 
                            while(rs.next()){      
                    
      out.write("   \n");
      out.write("                    <tr>\n");
      out.write("                         <th>");
      out.print(rs.getInt("id_usuario"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getInt("u_privilegio"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getString("u_nombre"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getString("u_user"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getString("email"));
      out.write("</th>\n");
      out.write("                            <th>");
      out.print(rs.getString("password"));
      out.write("</th>\n");
      out.write("                            <th>\n");
      out.write("                                <a>editar</a>\n");
      out.write("                                <a>eliminar</a>\n");
      out.write("                            </th>\n");
      out.write("                    </tr>\n");
      out.write("                    ");
 } 
      out.write("\n");
      out.write("            </table>       \n");
      out.write("        </div>\n");
      out.write("        <div>\n");
      out.write("            <h1> agregar usuario</h1>\n");
      out.write("            \n");
      out.write("            <form action=\"srvcontrolU\">\n");
      out.write("                nombre:<input type=\"text\" name=\"u_nombre\"><br>\n");
      out.write("                privilegio:<input type=\"text\" name=\"u_privilegio\"><br>\n");
      out.write("                nombre usuario:<input type=\"text\" name=\"u_privilegio\"><br>\n");
      out.write("                email:<input type=\"email\" name=\"email\"><br>\n");
      out.write("                contraseña:<input type=\"password\" name=\"password\"><br>\n");
      out.write("                <input type=\"submit\" name=\"agregar\" value=\"agregar\"><br>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </div>\n");
      out.write("        <h1>\n");
      out.write("           BUSCAR USUARIO\n");
      out.write("        </h1>\n");
      out.write("        <form action=\"srvcontrolU\" method=\"post\">\n");
      out.write("            <table>\n");
      out.write("                <tr>\n");
      out.write("                    <td><h5>ingresar id</h5></td>\n");
      out.write("                    <td><input type=\"text\" name=\"id_usuario\"></td>\n");
      out.write("                    <td><input type=\"submit\" name=\"buscar\" value=\"buscar\"></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                \n");
      out.write("            </table>\n");
      out.write("            <table border=\"1\">\n");
      out.write("                    <thead>\n");
      out.write("                        <tr>\n");
      out.write("                            <th>id</th>\n");
      out.write("                            <th>nombre</th>\n");
      out.write("                            <th>privilegio</th>\n");
      out.write("                            <th>user</th>\n");
      out.write("                            <th>email</th>\n");
      out.write("                            <th>passwrod</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>");
      out.print(request.getParameter("id_usuario"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(request.getParameter("u_privilegio"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(request.getParameter("u_nombre"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(request.getParameter("u_user"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(request.getParameter("email"));
      out.write("</td>\n");
      out.write("                            <td>");
      out.print(request.getParameter("password"));
      out.write("</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            \n");
      out.write("            \n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
