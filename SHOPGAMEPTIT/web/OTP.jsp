<%-- 
    Document   : OTP
    Created on : Jun 12, 2023, 6:44:38 PM
    Author     : Duong Nguyen
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>OTP</title>
        <link rel="stylesheet" href="./assets/css/style.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
        <style>
            .message{
                text-align: center;
            }
        </style>
    </head>
    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>

                <div class="main-content">
                    <div class="container">
                        <h1>
                            <i class="fa fa-lock fa-4x"></i>
                        </h1>
                        <h1>Enter OTP</h1>
                    <%
                        if (request.getAttribute("message") != null) {
                            out.print("<div style='color: red' class='message'>" + request.getAttribute("message") + "</div>");
                        }

                    %>
                    <form style="padding-bottom: 32px" action="otp" method="post">
                        <div class="form-control">
                            <input name="otp" type="text" id="otp" placeholder="#######" />
                            <span></span>
                            <small></small>
                        </div>

                        <input type="submit" value="Reset Password" />
                    </form>
                </div>
            </div>

            <jsp:include page="Footer.jsp"></jsp:include>

            <!--<script src="app.js"></script>-->
        </div>
    </body>
</html>
