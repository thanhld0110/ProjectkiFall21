/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.AppartmentDBContext;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Apartment;

/**
 *
 * @author win
 */
public class InsertController extends HttpServlet {

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
            out.println("<title>Servlet InsertController</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet InsertController at " + request.getContextPath() + "</h1>");
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
        request.getRequestDispatcher("InsertApartment.jsp").forward(request, response);
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
         Apartment a = new Apartment();
        a.setApartName(request.getParameter("txtApartName"));
        a.setHoseName(request.getParameter("txtHoseName"));
        a.setPhone(request.getParameter("txtPhone"));
        a.setPrice(Double.parseDouble(request.getParameter("txtPrice")));
        a.setAddress(request.getParameter("txtAddress"));
        a.setDescription(request.getParameter("mlDescriptipn"));
        a.setTotal(Integer.parseInt(request.getParameter("txtTotal")));
        a.setArea(Float.parseFloat(request.getParameter("txtArea")));
        a.setImage(request.getParameter("txtImage"));
        a.setImage1(request.getParameter("txtImage1"));
        a.setImage2(request.getParameter("txtImage2"));
        a.setImage3(request.getParameter("txtImage3"));
        a.setTotalNow(Integer.parseInt(request.getParameter("txtTotalNow")));
        AppartmentDBContext adb = new AppartmentDBContext();
        adb.insertApartment(a);
//        request.getRequestDispatcher("InsertApartment.jsp").forward(request, response);
        response.sendRedirect("manager");
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
