<%-- 
    Document   : Register
    Created on : May 13, 2023, 8:09:04 PM
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
                        <h1>Đổi mật khẩu</h1>
                        <form action="changepass" method="post">
                            <div style="color: red;margin-top: 5px ">
                            ${mess}
                        </div>
                        <div class="form-control">
                            <input name="pass" type="text" id="username" placeholder="Mật khẩu hiện tại" />
                            <span></span>
                            <small></small>
                        </div>

                        <div class="form-control">
                            <input name="newpass" type="password" id="password" placeholder="Mật khẩu mới" />
                            <span></span>
                            <small></small>
                        </div>
                        <div class="form-control">
                            <input name="newpassword" type="password" id="password2" placeholder="Nhập lại mật khẩu mới" />
                            <span></span>
                            <small></small>
                        </div>
                        <input type="submit" value="Đổi mật khẩu" />
                        <div class="signup_link">Already have an account? <a href="Login.jsp">Đăng nhập</a></div>
                    </form>
                </div>
            </div>

            <jsp:include page="Footer.jsp"></jsp:include>

            <!--<script src="./app.js"></script>-->
        </div>
    </body>

</html>
