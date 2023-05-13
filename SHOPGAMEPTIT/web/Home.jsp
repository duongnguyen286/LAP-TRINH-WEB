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

    </head>

    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>

                <div class="main-content">
                    <div class="product_list">
                    <c:forEach items="${ListP}" var="o">
                        <div class="product_item">
                            <div class="image">
                                <a href="detail?pid=${o.id}">
                                    <img src="https://lienquan24h.com/upload/product/4aa2e4a1bdca94737c3c20ac41f4c604.gif">
                                    <span class="ID">ID: ${o.id}</span>
                                </a>
                            </div>
                            <div class="description">
                                ${o.descripsion}
                            </div>
                            <div class="attribute_info">
                                <div class="infor_nick">
                                    Rank: <b>${o.rank}</b>
                                </div>
                                <div class="infor_nick">
                                    Ngọc 90: <b>${o.ngoc}</b>
                                </div>
                                <div class="infor_nick">
                                    Tướng: <b>${o.tuong}</b>
                                </div>
                                <div class="infor_nick">
                                    Trang Phục: <b>${o.trang_phuc}</b>
                                </div>
                                <div class="infor_nick">
                                    Loại Nick: <b>${o.loai_nick}</b>
                                </div>
                            </div>
                            <div class="a-more" style="padding-top: 8px;">
                                <div class="price_item">
                                    ${o.price}đ
                                </div>
                                <div class="view">
                                    <a href="detail?pid=${o.id}" title="View Product">CHI TIẾT</a>
                                </div>
                            </div>
                        </div>
                    </c:forEach>



                </div>
            </div>



            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>