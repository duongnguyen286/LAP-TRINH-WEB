<%-- 
    Document   : QLNapTien
    Created on : Jun 13, 2023, 5:35:38 PM
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
                <div style="background-color: #f2f2f2" >
                    QUẢN LÍ TÀI KHOẢN
                </div>
            </a>
            <a class="col-2" href="qlnaptien">
                <div style="background-color: #4CAF50" >
                    QUẢN LÍ NẠP TIỀN
                </div>
            </a>
        </div>
        <div class="abc">
            <a href="home"><button>HOME</button></a>
            <button id="addsp">CỘNG TIỀN</button>
        </div>
        <table>
            <tr>
                <th>UID</th>
                <th>USER NAME</th>
                <th>SỐ DƯ</th>
                    <c:forEach items="${ListA}" var="o">
                <tr>
                    <td>${o.uID}</td>
                    <td>${o.username}</td>
                    <td>${o.sodu}</td>
                </tr>
            </c:forEach>

        </table>

        <div id="overlay">
            <div id="form-container">
                <h2>Cộng tiền</h2>
                <form action="naptien" method="post">
                    <label for="image">User:</label>
                    <input type="text" name="username" required>
                    
                    <label for="image">Số tiền cộng:</label>
                    <input type="text" name="congthem" required>

                    <button type="submit">Nạp</button>
                    <button type="button" onclick="closeForm()">Cancel</button>
                </form>
            </div>
        </div>
        <script src="js/qlsp.js"></script>
    </body>
</html>