<%-- 
    Document   : password_reset
    Created on : Nov 9, 2015, 1:09:36 PM
    Author     : meganmcdonald
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Password Reset</title>
    </head>
    <body>
       
        <h1>Reset Your Password:</h1>
        <form action="ResetPasswordServlet" method="post">
            <input type ="hidden" name="action" value="add">
            <label>Current Password:</label>
            <span> ${user.passWord}</span><br>
            
            <label> Change your password: </label>
            <input type="text" name="newPassWord" required><br>
            <label></label>
            <input type="submit" value="Reset" id="submit">
            
        </form>
            
    </body>
</html>
