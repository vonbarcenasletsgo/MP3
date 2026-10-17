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
            }else if (vowelChecker(temp)) {
                numberOfVowels++;
            }else if (symbolChecker(temp)) {
                numberOfSymbols++;
            }else if (consonantChecker(temp)) {
                numberOfConsonants++;
            }
        }
        
        request.setAttribute("digits", numberOfDigits);
        request.setAttribute("vowels", numberOfVowels);
        request.setAttribute("symbols", numberOfSymbols);
        request.setAttribute("consonants", numberOfConsonants);
        request.getRequestDispatcher("success.jsp").forward(request, response);

    }

    public boolean numberChecker(char c) {
        
        return (c == '0' || c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8' || c == '9');
         
    }

    public boolean vowelChecker(char c) {
        char temp = Character.toLowerCase(c);
        
        return (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u');
    }

    public boolean symbolChecker(char c) {
        return (c == '!' || c == '?' || c == '@' || c == '#' || c == '.'); 
    }
    
    public boolean consonantChecker(char c){
        return(!vowelChecker(c) && !symbolChecker(c) && !numberChecker(c) && c != (' '));
        
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
