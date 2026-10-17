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
 * @author Vaughn
 */
public class CharacterCountingServlet extends HttpServlet {

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

        String sample = request.getParameter("randomString");

        String modifiedString = sample.trim();
        int stringLength = modifiedString.length();
        int numberOfDigits = 0;
        int numberOfVowels = 0;
        int numberOfSymbols = 0;

        for (int x = 0; x < stringLength; x++) {
            if (numberChecker(sample.charAt(x))) {
                numberOfDigits++;
            }

            if (vowelChecker(sample.charAt(x))) {
                numberOfVowels++;
            }

            if (symbolChecker(sample.charAt(x))) {
                numberOfSymbols++;
            }
        }

        int numberOfConsonants = modifiedString.length() - numberOfVowels;
        
    }

    public boolean numberChecker(char c) {
        boolean res = false;
        if (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9') {
            res = true;
        }
        return res;
    }

    public boolean vowelChecker(char c) {
        boolean res = false;
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            res = true;
        }
        return res;
    }

    public boolean symbolChecker(char c) {
        boolean res = false;
        if (c == '!' || c == '?' || c == '@' || c == '#' || c == '.') {
            res = true;
        }
        return res;
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
