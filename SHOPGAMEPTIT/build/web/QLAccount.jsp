<%-- 
    Document   : QLUser
    Created on : May 16, 2023, 6:01:30 PM
    Author     : Duong Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Quản lí tài khoản</title>
        <link rel="stylesheet" type="text/css" href="assets/css/qlsp.css">
        <style>
        </style>
    </head>
    <body>
        <div class="row">
            <a class="col-2" href="qlsp">
                <div style="background-color: #f2f2f2" >
                    QUẢN LÍ SẢN PHẨM
                </div>
            </a>
            <a class="col-2" href="qlaccount">
                <div style="background-color: #4CAF50" >
                    QUẢN LÍ TÀI KHOẢN
                </div>
            </a>
        </div>
        <a href="home"><button>HOME</button></a>
        <table>
            <tr>
                <th>UID</th>
                <th>USER NAME</th>
                <th>PASS</th>
                <th>EMAIL</th>
                <th>IS ADMIN</th>
                <th>ACTION</th>
                    <c:forEach items="${ListA}" var="o">
                <tr>
                    <td>${o.uID}</td>
                    <td>${o.username}</td>
                    <td>${o.pass}</td>
                    <td>${o.email}</td>
                    <td>${o.isAdmin}</td>
                    <td>
                        <a href="loadaccount?uID=${o.uID}">
                            <button>Edit</button>
                        </a>
                        <a href="deleteaccount?uID=${o.uID}">
                            <button>Delete</button>
                        </a>

                    </td>
                </tr>
            </c:forEach>

        </table>

    </body>
</html>