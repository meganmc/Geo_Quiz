package mcdonald;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import mcdonald.User;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author meganmcdonald
 */
public class NewCustomerServlet extends HttpServlet {
@Override
    protected void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String url = "new_customer.html";
        PrintWriter write = response.getWriter();
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        
        if(action.equals("join")) {
            
            write.println("Please fill out all the form fields");
            url = "new_customer.html";
        }
        else if (action.equals("add")) {
            String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            String phoneNumber = request.getParameter("phoneNumber");
            String address = request.getParameter("address");
            String city = request.getParameter("city");
            String state = request.getParameter("state");
            String zipCode = request.getParameter("zipCode");
            String email = request.getParameter("email");
            String userName = lastName + zipCode;
            String passWord = "welcome1";
            
            User user = new User(firstName, lastName, phoneNumber, address, city, state, zipCode, email, userName, passWord);
            request.setAttribute("user", user);
            
            url = "/success.html";
        }
        getServletContext()
        .getRequestDispatcher(url)
        .forward(request, response);
        //adding new user to session scope
        HttpSession session = request.getSession();
        session.setAttribute("user", session);
        
                
}
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        doPost(request, response);
        
    }
}