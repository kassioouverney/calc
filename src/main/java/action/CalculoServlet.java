/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Calculadora;

/**
 *
 * @author daves
 */
@WebServlet(name = "CalculoServlet", urlPatterns = {"/calcula"})
public class CalculoServlet extends HttpServlet {

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
        
        Calculadora calc = new Calculadora(Double.parseDouble(request.getParameter("cpValor1")), Double.parseDouble(request.getParameter("cpValor2")));
        String btn = request.getParameter("btn");
        RequestDispatcher rd = request.getRequestDispatcher("calculadora.jsp");
        if (btn.equals("+")){
            request.setAttribute("resultado", calc.adicao());
            
        }else if (btn.equals("-")){
            request.setAttribute("resultado", calc.subtracao());
        }else if (btn.equals("X")){
            request.setAttribute("resultado", calc.multiplicacao());
        }else if (btn.equals("/")){
            try {
                request.setAttribute("resultado", calc.divisao());
            } catch (Exception ex) {
                
            }
        }else if (btn.equals("%")){
            request.setAttribute("resultado", calc.percentual());
        }else{
             request.setAttribute("resultado", "ERRO!!!");
        }
        rd.forward(request, response);
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
