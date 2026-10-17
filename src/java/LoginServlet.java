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
import javax.servlet.RequestDispatcher;

/**
 *
 * @author Vaughn
 */
public class LoginServlet extends HttpServlet {

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

        //get init-params
        String validUserName = getInitParameter("userName");
        String validPassword = getInitParameter("password");

        //get user input
        String inputUsername = request.getParameter("userName");
        String inputPassword = request.getParameter("password");
        
        //validation of user input
        if (inputUsername.isEmpty() && inputUsername.isEmpty()) {
            request.setAttribute("errorMessage", "NO USERNAME AND PASSWORD WAS INPUTTED!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        
        if (inputUsername.isEmpty()) {
            request.setAttribute("errorMessage", "NO USERNAME WAS INPUTTED!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }
        
        if (inputPassword.isEmpty()) {
            request.setAttribute("errorMessage", "NO PASSWORD WAS INPUTTED!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        if (!inputUsername.equals(validUserName)) {
            request.setAttribute("errorMessage", "INVALID USERNAME!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        if (!inputPassword.equals(validPassword)) {
            request.setAttribute("errorMessage", "INVALID PASSWORD!");
            request.getRequestDispatcher("error.jsp").forward(request, response);
            return;
        }

        //if success
        request.getRequestDispatcher("success.jsp").forward(request, response);
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