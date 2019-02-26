/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author FCAdmin
 */
@WebServlet(name = "handle_form", urlPatterns = {"/handle_form"})
public class handle_form extends HttpServlet {

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
        String fn = request.getParameter("firstname");
        String ln = request.getParameter("lastname");
        String car = request.getParameter("cars");
        String message = request.getParameter("message");
        String color = request.getParameter("color");
        String number = request.getParameter("number");
        String email = request.getParameter("email");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet handle_form</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet handle_form at " + request.getContextPath() + "</h1>");
            out.println("<h1>Form Data</h1>");
            out.println("<div style='font-size: 2em;'>");
            out.println("<table style='width:50%'>");
            out.println("<tr>");
            out.println("<th>Parameter</th>");
            out.println("<th>Value</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>First Name</td>");
            out.println("<td>" + fn + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Last Name</td>");
            out.println("<td>" + ln + "</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Cars</td>");
            out.println("<td>" + car + "</td>");
            out.println("</tr>");
            out.println("<td>Message</td>");
            out.println("<td>" + message + "</td>");
            out.println("</tr>");
            out.println("<td>Color</td>");
            out.println("<td>" + color + "</td>");
            out.println("</tr>");
            out.println("<td>Number</td>");
            out.println("<td>" + number + "</td>");
            out.println("</tr>");
            out.println("<td>Email</td>");
            out.println("<td>" + email + "</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("</div>");
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
