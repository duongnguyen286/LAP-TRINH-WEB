<%-- 
    Document   : NewPassword
    Created on : Jun 12, 2023, 7:32:57 PM
    Author     : Duong Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lap Trinh Web</title>

        <link rel="stylesheet" href="./assets/css/style.css">
    </head>

    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>

                <div class="main-content">
                    <div class="container">
                        <h1>Reset Password</h1>
                        <form action="newpassword" method="post">
                            <div class="form-control">
                                <input name="pass" type="password" id="password" placeholder="Password" />
                                <span></span>
                                <small></small>
                            </div>
                            <div class="form-control">
                                <input type="password" id="confpassword" placeholder="Confirm password" />
                                <span></span>
                                <small></small>
                            </div>
                            <input type="submit" value="Reset" />
                            <div class="signup_link">Already have an account? <a href="#">Login</a></div>
                        </form>
                    </div>
                </div>

            <jsp:include page="Footer.jsp"></jsp:include>

            <!--<script src="./app.js"></script>-->
        </div>
    </body>
    
</html>
