/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Genero;
import Modelo.Mascota;
import Modelo.Talla;
import Modelo.TipoMascota;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author duvan
 */
@WebServlet(name = "ValidarMascota", urlPatterns = {"/ValidarMascota"})
public class ValidarMascota extends HttpServlet {
    
     Mascota dto =new Mascota();
 List<Mascota> Lista = new ArrayList<>();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ValidarMascota</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ValidarMascota at " + request.getContextPath() + "</h1>");
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
        
         String action = request.getParameter("accion");
        if (action.equalsIgnoreCase("create")) {
            String nombre = request.getParameter("txt_nombre");
            Genero genero = Genero.valueOf(request.getParameter("genero"));
            TipoMascota tipoMascota = TipoMascota.valueOf(request.getParameter("TipoMascota"));
            String edad = request.getParameter("txt_edad");
            String raza = request.getParameter("txt_raza");
            Talla talla = Talla.valueOf(request.getParameter("talla"));
             String descripcion = request.getParameter("txt_desc");
            
          
           dto=new Mascota(nombre, genero, tipoMascota, edad, raza, talla, descripcion);
            Lista = (List<Mascota>) request.getSession().getAttribute("Lista");
            if (Lista == null) {
                Lista = new ArrayList<>();
                Lista.add(dto);
                request.getSession().setAttribute("Lista", Lista);
            } else {
                if (!Lista.contains(dto)) {
                    Lista.add(dto);
                    request.getSession().setAttribute("Lista", Lista);
                }
            }
            response.sendRedirect("Vistas/GuardarMascota.jsp");
    }
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
