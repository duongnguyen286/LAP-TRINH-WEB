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
        <title>Chỉnh sửa sản phẩm</title>
        <style>

            table {
                border-collapse: collapse;
                width: 100%;
            }

            th, td {
                text-align: left;
                padding: 8px;
            }

            tr:nth-child(even) {
                background-color: #f2f2f2;
            }

            th {
                background-color: #4CAF50;
                color: white;
            }

            h1 {
                text-align: center;
            }

            button {
                margin: 8px 0;
                padding: 10px;
                font-size: 16px;
                background-color: #4CAF50;
                color: white;
                border: none;
                cursor: pointer;
            }

            #overlay {
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background-color: rgba(0, 0, 0, 0.5);
                display: none;
            }

            #form-container {
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background-color: white;
                padding: 20px;
            }
            tr {
                border: 1px solid #ccc;
                height: 60px;
            }
            input{
                width: 100%;
                height: 40px;
            }

        </style>
    </head>
    <body>
        <h1>Chỉnh sửa sản phẩm ID = ${detail.id}</h1>
        <a href="home"> <button>HOME</button> </a>
        <form action="editproduct" method="post">
            <table>
                <tr>
                    <th>ID</th>
                    <th><input style="background-color: #ccc; border: none" value="${detail.id}" type="text" name="id" readonly required ></th>
                </tr>
                <tr>
                    <th>Image</th>
                    <th><input value="${detail.image}" type="text" name="image" required></th>
                </tr>
                
                <tr>
                    <th>Nổi bật</th>
                    <th><input value="${detail.descripsion}" type="text" name="descripsion" required></input></th>
                </tr>
                <tr>
                    <th>Rank</th>
                    <th><input value="${detail.rank}" type="text" name="rank" required></th>
                </tr>
                <tr>
                    <th>Ngọc 90</th>
                    <th><input value="${detail.ngoc}" type="text" name="ngoc" required></th>
                </tr>
                <tr>
                    <th>Tướng</th>
                    <th><input value="${detail.tuong}" type="text" name="tuong" required></th>
                </tr>
                <tr>
                    <th>Trang phục</th>
                    <th><input value="${detail.trang_phuc}" type="text" name="trang_phuc" required></th>
                </tr>
                <tr>
                    <th>Trạng thái</th>
                    <th><input value="${detail.loai_nick}" type="text" name="loai_nick" required></th>
                </tr>
                <tr>
                    <th>Giá bán</th>
                    <th><input value="${detail.price}" type="text" name="price" required></th>
                </tr>
            </table>

            <button type='submit'>SAVE</button>
        </form>
        <a href="qlsp"> <button>CANCEL</button> </a>

    </body>
</html>