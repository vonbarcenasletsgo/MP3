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
    private String digitsList;
    private String vowelsList;
    private String consonantsList;

    @Override
    public void init() throws ServletException {
        digitsList = getInitParameter("digits");
        vowelsList = getInitParameter("vowels");
        consonantsList = getInitParameter("consonants");

    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String sample = request.getParameter("randomString");

        String modifiedString = sample.trim();

        int stringLength = modifiedString.length();
        int numberOfDigits = 0;
        int numberOfVowels = 0;
        int numberOfSymbols = 0;
        int numberOfConsonants = 0;

        for (int x = 0; x < stringLength; x++) {
            char temp = modifiedString.charAt(x);

            if (numberChecker(temp)) {
                numberOfDigits++;
            } else if (vowelChecker(temp)) {
                numberOfVowels++;
            } else if (consonantChecker(temp)) {
                numberOfConsonants++;
            } else if (symbolChecker(temp)) {
                numberOfSymbols++;
            }
        }
        request.setAttribute("length", stringLength);
        request.setAttribute("digits", numberOfDigits);
        request.setAttribute("vowels", numberOfVowels);
        request.setAttribute("symbols", numberOfSymbols);
        request.setAttribute("consonants", numberOfConsonants);
        request.getRequestDispatcher("success.jsp").forward(request, response);

    }

    public boolean numberChecker(char c) {

        return digitsList.indexOf(c) != -1;

    }

    public boolean vowelChecker(char c) {

        return vowelsList.indexOf(c) != -1;
    }

    public boolean consonantChecker(char c) {

        return consonantsList.indexOf(c) != -1;

    }

    public boolean symbolChecker(char c) {
        return !(numberChecker(c) || vowelChecker(c) || consonantChecker(c));
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
