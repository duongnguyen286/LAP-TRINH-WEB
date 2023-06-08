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
            .center {
                text-align: center;
                margin-top:10px
            }

            .pagination {
                display: inline-block;
            }

            .pagination a {
                color: black;
                float: left;
                padding: 8px 16px;
                text-decoration: none;
                transition: background-color .3s;
                border: 1px solid #ddd;
                margin: 0 4px;
            }

            .pagination a.active {
                background-color: #4CAF50;
                color: white;
                border: 1px solid #4CAF50;
            }

            .pagination a:hover:not(.active) {
                background-color: #ddd;
            }
            .search-form {
               
                margin-left: 965px;
                
            }
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
        <form action="searchqlaccount?indexa=1" method="post" class="search-form">
            <input type="text" id="keyword" name="txt" placeholder="Nhập từ khóa...">
            <button type="submit">Tìm kiếm</button>
        </form>
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

        <div class="center">
            <div class="pagination">
                <c:forEach begin="1" end="${endP}" var="i">
                    <a class="${cnt==i?"active":""}" href="qlaccount?index=${i}">${i}</a>
                </c:forEach>
            </div>
        </div>
    </body>
</html>