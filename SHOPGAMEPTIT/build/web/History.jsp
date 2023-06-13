<%-- 
    Document   : History
    Created on : Jun 9, 2023, 12:42:24 PM
    Author     : Duong Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Lap Trinh Web</title>

        <link rel="stylesheet" href="./assets/css/style.css">
        <style type="text/css">
            table, th, td{
                border:1px solid #868585;
            }
            table{
                border-collapse:collapse;
                width:100%;
            }
            th, td{
                text-align:left;
                padding:10px;
            }
            table tr:nth-child(odd){
                background-color:#eee;
            }
            table tr:nth-child(even){
                background-color:white;
            }
            table tr:nth-child(1){
                background-color:skyblue;
            }
            h3 {
                padding: 4px 0;
            }
        </style>

    </head>

    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="main-content" style="display: block; padding: 48px 32px ">
                    <h2 style="text-align: center">THÔNG TIN TÀI KHOẢN</h2>
                    <h3>User name: ${sessionScope.account.username}</h3>
                <h3>Pass: <a href="ChangePass.jsp">Đổi mật khẩu</a></h3>
                <h3> Email: ${sessionScope.account.email}</h3>
                <h3 style="padding-bottom: 48px">Số dư tài khoản: ${sessionScope.account.sodu}đ</h3>
                <hr/>
                <h2 style="padding-top: 48px; text-align: center; padding-bottom: 4px">LỊCH SỬ GIAO DỊCH</h2>
                <table>
                    <tr>
                        <th>STT</th>
                        <th>THỜI GIAN MUA</th>
                        <th>ID NICK GAME</th>
                        <th>TÀI KHOẢN</th>
                        <th>MẬT KHẨU</th>
                        <th>GIÁ</th>
                    </tr>
                    <c:forEach items="${ListH}" var="o" varStatus="loop">
                        <tr>
                            <td>${loop.index +1}</td>
                            <td>${o.date}</td>
                            <td>${o.id}</td>
                            <td>${o.taikhoan}</td>
                            <td>${o.matkhau}</td>
                            <td>${o.price}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>