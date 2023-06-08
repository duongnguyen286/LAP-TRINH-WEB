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

        <style>
            img {
                width: 80%;
                height: auto;
                display: inline-block;
                padding-top: 8px;
            }

            h1 {
                font-size: 36px;
                margin-bottom: 10px;
            }

            p {
                font-size: 18px;
                line-height: 1.5;
            }

            table {
                border-collapse: collapse;
                width: 80%;
                margin-top: 48px;
            }

            th,
            td {
                text-align: left;
                padding: 8px;
                border: 1px solid #ccc;
            }

            th {
                background-color: #333;
                color: white;
                width: 20%;
            }

            .badge {
                display: inline-block;
                padding: 3px 6px;
                font-size: 14px;
                font-weight: bold;
                line-height: 1;
                text-align: center;
                white-space: nowrap;
                vertical-align: baseline;
                border-radius: 10px;
            }

            .badge-success {
                background-color: #28a745;
                color: white;
            }

            .badge-danger {
                background-color: #dc3545;
                color: white;
            }

            button {
                width: 80%;
                height: 48px;
                background-color: #32c5d2;
                color: white;
                font-weight: bold;
                font-size: 20px;
                border: none;
            }

        </style>
    </head>

    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>

                <div class="main-content">
                    <table>
                        <tr>
                            <th>ID:</th>
                            <td>${detail.id}</td>
                    </tr>
                    <tr>
                        <th>Mô tả:</th>
                        <td>${detail.descripsion}</td>
                    </tr>
                    <tr>
                        <th>Rank:</th>
                        <td>
                            <span class="badge badge-success">${detail.rank}</span>
                        </td>
                    </tr>
                    <tr>
                        <th>Ngọc 90:</th>
                        <td>${detail.ngoc}</td>
                    </tr>
                    <tr>
                        <th>Tướng:</th>
                        <td>${detail.tuong}</td>
                    </tr>
                    <tr>
                        <th>Trang Phục:</th>
                        <td>${detail.trang_phuc}</td>
                    </tr>
                    <tr>
                        <th>Loại Nick:</th>
                        <td>${detail.loai_nick}</td>
                    </tr>
                    <tr>
                        <th>Giá:</th>
                        <td>${detail.price}</td>
                    </tr>
                </table>
                <button><a href="buy?pid=${detail.id}">MUA</a> </button>
                <img src="${img.a1}" alt="Ảnh sản phẩm">
                <img src="${img.a2}" alt="Ảnh sản phẩm">
                <img src="${img.a3}" alt="Ảnh sản phẩm">
                <img src="${img.a4}" alt="Ảnh sản phẩm">
                <img src="${img.a5}" alt="Ảnh sản phẩm">
                <img src="${img.a6}" alt="Ảnh sản phẩm">
                <img src="${img.a7}" alt="Ảnh sản phẩm">

            </div>

            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>