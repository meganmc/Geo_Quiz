/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author meganmcdonald
 */
public class LoginServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        
        String url = "/login.html";
        
        String username = request.getParameter("userName");
        String password = request.getParameter("passWord");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        RequestDispatcher rd = null;
        request.setAttribute(username, "UserName");
        if (username.equals("jsmith@toba.com") && password.equals("letmein")){
            rd = request.getRequestDispatcher("/account_activity.html");
            rd.forward(request, response);
            
        }
        else {rd = request.getRequestDispatcher("/login_failure.html");
        rd.include(request, response);
        }
    }
        @Override
        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
            }
        
    }
