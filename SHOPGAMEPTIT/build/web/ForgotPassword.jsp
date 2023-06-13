<%-- 
    Document   : ForgotPassword
    Created on : Jun 12, 2023, 6:28:07 PM
    Author     : Duong Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Forgot Password</title>
        <link rel="stylesheet" href="./assets/css/style.css">
    </head>
    <body>
        <div class="wrapper">
        <jsp:include page="Header.jsp"></jsp:include>

        <div class="main-content">
            <div class="container">
                <h1>Forgot Password</h1>
                <form action="forgotpassword" method="post">
                    <div class="form-control">
                        <input name="email" type="text" id="password" placeholder="Email" />
                        <span></span>
                        <small></small>
                    </div>
                    
                    <input type="submit" value="Send email" />
                    <div class="signup_link">Already have an account? <a href="Login.jsp">Login</a></div>
                </form>
            </div>
        </div>

        <jsp:include page="Footer.jsp"></jsp:include>

        <!--<script src="app.js"></script>-->
    </div>
    </body>
</html>
