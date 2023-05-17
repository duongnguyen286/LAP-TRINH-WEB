<%-- 
    Document   : QLSP
    Created on : May 15, 2023, 2:14:34 PM
    Author     : Duong Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Quản lí sản phẩm</title>
        <link rel="stylesheet" type="text/css" href="assets/css/qlsp.css">
        <style>
        </style>
    </head>
    <body>
        <div class="row">
            <a class="col-2" href="qlsp">
                <div style="background-color: #4CAF50" >
                    QUẢN LÍ SẢN PHẨM
                </div>
            </a>
            <a class="col-2" href="qlaccount">
                <div style="background-color: #f2f2f2" >
                    QUẢN LÍ TÀI KHOẢN
                </div>
            </a>
        </div>


        <a href="home"><button>HOME</button></a>
        <button id="addsp">THÊM SẢN PHẨM MỚI</button>
        <table>
            <tr>
                <th>IMAGE</th>
                <th>ID</th>
                <th>NỔI BẬT</th>
                <th>RANK</th>
                <th>NGỌC 90</th>
                <th>TƯỚNG</th>
                <th>TRANG PHỤC</th>
                <th>TRẠNG THÁI</th>
                <th>GIÁ BÁN</th>
                <th>ACTION</th>
            </tr>
            <c:forEach items="${ListP}" var="o">
                <tr>
                    <td><img style="height: 100px" src="${o.image}" alt=""></td>
                    <td>${o.id}</td>
                    <td>${o.descripsion}</td>
                    <td>${o.rank}</td>
                    <td>${o.ngoc}</td>
                    <td>${o.tuong}</td>
                    <td>${o.trang_phuc}</td>
                    <td>${o.loai_nick}</td>
                    <td>${o.price}</td>
                    <td>
                        <a href="loadproduct?pid=${o.id}">
                            <button>Edit</button>
                        </a>
                        <a href="deleteproduct?pid=${o.id}">
                            <button>Delete</button>
                        </a>

                    </td>
                </tr>
            </c:forEach>

        </table>


        <div id="overlay">
            <div id="form-container">
                <h2>Thêm sản phẩm mới</h2>
                <form action="addproduct" method="post">
                    <label for="image">Image URL:</label>
                    <input type="text" name="image" required>

                    <label for="id">ID:</label>
                    <input type="text" name="id" required>

                    <label for="description">Description:</label>
                    <textarea name="description" required></textarea>

                    <label for="rank">Rank:</label>
                    <input type="text" name="rank" required>

                    <label for="ngoc">Ngọc:</label>
                    <input type="text" name="ngoc" required>

                    <label for="tuong">Tướng:</label>
                    <input type="text" name="tuong" required>

                    <label for="trang-phuc">Trang phục:</label>
                    <input type="text" name="trang_phuc" required>

                    <label for="loai-nick">Loại nick:</label>
                    <input type="text" name="loai_nick" required>

                    <label for="price">Price:</label>
                    <input type="text" name="price" required>

                    <button type="submit">Add</button>
                    <button type="button" onclick="closeForm()">Cancel</button>
                </form>
            </div>
        </div>

        <script src="js/qlsp.js"></script>
    </body>
</html>