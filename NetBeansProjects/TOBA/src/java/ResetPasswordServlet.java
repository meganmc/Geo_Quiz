/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 *
 * @author meganmcdonald
 */
@WebServlet(urlPatterns = {"/ResetPasswordServlet"})
public class ResetPasswordServlet extends HttpServlet {
@Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException { 
            
            String url = "/reset_password.jsp";
            PrintWriter write = response.getWriter();
            HttpSession session = request.getSession();
            session.setAttribute("user", session);
            String action = request.getParameter("action");
            
            if (action == null) {
                 action = "change";
            }
        
             if(action.equals("change")) {  
                write.println("Please fill out all the form fields");
                url = "/password_reset.jsp";
             }
             else if(action.equals("add")){
                 String password = request.getParameter("newPassWord");
                 session.setAttribute("user", session);
                 url = "/account_activity.html";
             }
        
}
    @Override
        protected void doGet (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
            }
}