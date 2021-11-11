package org.apache.jsp.Vistas;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import Modelo.Mascota;

public final class GuardarMascota_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("         <link rel=\"stylesheet\" href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css\" integrity=\"sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2\" crossorigin=\"anonymous\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       <div class=\"container\">\n");
      out.write("            <h1 style=\"text-align: center;\" class=\"mt-3\">Lista de mascotas registradas</h1>\n");
      out.write("            <a class=\"btn btn-success mb-3\" href=\"Vistas/RegistroMascota.jsp\">Registrar una mascota</a>\n");
      out.write("            <table id=\"tabla\" class=\"table table-striped table-bordered mt-3 \">\n");
      out.write("                <thead class=\"thead-responsive\">\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Nombre</th>\n");
      out.write("                        <th>Género</th>\n");
      out.write("                        <th>Tipo Mascota</th>\n");
      out.write("                        <th>Edad</th>\n");
      out.write("                        <th>Raza</th>\n");
      out.write("                        <th>Talla</th>\n");
      out.write("                        <th>Descripción</th>\n");
      out.write("                       \n");
      out.write("                    </tr>\n");
      out.write("                </thead>\n");
      out.write("                ");

                    List<Mascota> Lista = (List<Mascota>) request.getSession().getAttribute("Lista");
                    if (Lista == null) {               
                    } else {
                        for (int i = 0; i < Lista.size(); i++) {
                
      out.write("\n");
      out.write("                <tbody>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getNombre() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getGenero() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getTipoMascota() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getEdad() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getRaza() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getTalla() );
      out.write("</td>\n");
      out.write("                        <td>");
      out.print( Lista.get(i).getDescripcion() );
      out.write("</td>\n");
      out.write("                        \n");
      out.write("                          \n");
      out.write("                    </tr>\n");
      out.write("                    ");
}
                        }
      out.write("\n");
      out.write("                </tbody>\n");
      out.write("            </table>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("         <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/js/bootstrap.min.js\" integrity=\"sha384-w1Q4orYjBQndcko6MimVbzY0tgp4pWB4lZ7lr30WKz0vr/aWKhXdBNmNb5D92v7s\" crossorigin=\"anonymous\"></script>\n");
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
