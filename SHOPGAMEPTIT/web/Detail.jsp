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

            .main-content table {
                border-collapse: collapse;
                width: 80%;
                margin-top: 48px;
            }

            .main-content table th,
            td {
                text-align: left;
                padding: 8px;
                border: 1px solid #ccc;
            }

            .main-content table th {
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

            .main-content button {
                width: 80%;
                height: 48px;
                background-color: #32c5d2;
                color: white;
                font-weight: bold;
                font-size: 20px;
                border: none;
            }

            .aaa h4{
                margin-top: 100px;
                padding: 0;
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
                    <c:if test="${not empty mess}">
                    <tr>
                        <th>Thông báo:</th>
                        <td style="color: red">${mess}</td>
                    </tr>
                    </c:if>
                </table>
                        <button><a style="color: white" href="buy?pid=${detail.id}">THANH TOÁN TRỰC TIẾP</a> </button>
                        <div style="height: 8px; width: 100%"></div>
                <!--<button><a href="buy1?pid=${detail.id}">MUA NGAY</a> </button>-->
                        <button id="xacnhan">MUA NGAY</button>
                <img src="${img.a1}" alt="Ảnh sản phẩm">
                <img src="${img.a2}" alt="Ảnh sản phẩm">
                <img src="${img.a3}" alt="Ảnh sản phẩm">
                <img src="${img.a4}" alt="Ảnh sản phẩm">
                <img src="${img.a5}" alt="Ảnh sản phẩm">
                <img src="${img.a6}" alt="Ảnh sản phẩm">
                <img src="${img.a7}" alt="Ảnh sản phẩm">

            </div>
                <div id="abc">
                <div id="abd">
                    <div id="hoa1">
                        <h3> Xác nhận mua tài khoản</h3>
                    </div>
                    <div id="hoa2">
                        <h4> Thông tin nick #${sessionScope.pro.id}</h4>
                        <table>
                            <tr>
                                <td>Nhà cung cấp</td>
                                <th >SHOPGAMEPTIT</th>

                            </tr>
                            <tr>
                                <td>Tên game</td>
                                <th style="color:black ;">Liên Quân Mobile</th>

                            </tr>
                            <tr>
                                <td>Giá Tiền</td>
                                <th style="color:#28b8cf ;">${sessionScope.pro.price}</th>

                            </tr>

                        </table>
                    </div>
                    <div id="hoa3">
                        <!--                        <form action="buy1" method="post">
                                                    <button style="float: right;" type="button" onclick="closeForm()">Đóng</button>
                                                    <input type="hidden" name="price" value="${sessionScope.pro.price}">
                                                    <input type="hidden" name="sodu" value="${sessionScope.account.sodu}">
                                                    <div>${mess}</div>
                                                    <button style="float: right; background-color: aliceblue;">Xác nhận mua</button>
                                                </form>-->
                        <button style="float: right;" type="button" onclick="closeForm()">Đóng</button>
                        <!-- <button style="float: right; background-color: aliceblue;" type="submit">Xác nhận mua</button> -->
                        <button style="float: right; background-color: aliceblue;"><a style="text-decoration: none;color: black;" href="buy1?pid=${detail.id}">Xác nhận mua</a> </button>
                    </div>
                </div>
            </div>
            <script src="js/xacnhan.js"></script>

            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>