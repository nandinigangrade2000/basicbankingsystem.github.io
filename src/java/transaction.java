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
 * @author Nandini Gangrade
 */
public class transaction extends HttpServlet 
{
        @Override
        public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                response.sendRedirect("index.html");
        }
        @Override
        public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
        {
                  response.sendRedirect("transaction.jsp");   
        }

}
