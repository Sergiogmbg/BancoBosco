/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import modelo.PrestamoObjeto;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cuota;
import modelo.Utilidades;

/**
 *
 * @author DAW204
 */
@WebServlet(name = "Prestamo", urlPatterns = {"/Prestamo"})
public class Prestamo extends HttpServlet {

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
            out.println("<title>Servlet Prestamo</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Prestamo at " + request.getContextPath() + "</h1>");
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
        ArrayList<String> listaTiempo = Utilidades.generarLista();
        request.setAttribute("listaTiempo", listaTiempo);
        request.getRequestDispatcher("prestamo.jsp").forward(request, response);
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
        
        ArrayList<String> listaTiempo = Utilidades.generarLista();
        
        String nombre = request.getParameter("nombre");
        String cantidad = request.getParameter("cantidad");
        String interes = request.getParameter("interes");
        String tiempo = request.getParameter("tiempo");
        
        PrestamoObjeto pr = new PrestamoObjeto(Integer.parseInt(cantidad), Integer.parseInt(interes), Integer.parseInt(tiempo));
        
        ArrayList<Cuota> listaCuotas = Utilidades.generaListaCuotas(pr.getTiempo(), pr.getImportePrestamo());
        
        request.setAttribute("nombre", nombre);
        request.setAttribute("prestamo", pr);
        request.setAttribute("listaTiempo", listaTiempo);
        request.setAttribute("listaCuotas", listaCuotas);
        request.getRequestDispatcher("prestamo.jsp").forward(request, response);
        
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
