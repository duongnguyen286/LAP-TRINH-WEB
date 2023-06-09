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
            .center {
                text-align: center;
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

            .pagination a:hover:not(.active) {background-color: #ddd;}
        </style>
    </head>

    <body>
        <div class="wrapper">
            <jsp:include page="Header.jsp"></jsp:include>
                <div class="main-content">
                    <form action="search?indexs=1" method="post" class="search-form">
                        <div class="a">
                            <label for="keyword">Tìm kiếm</label>
                            <input type="text" id="keyword" name="txt" placeholder="Nhập từ khóa...">
                            <label for="maso" style="padding-left: 24px">Mã Số</label>
                            <input type="text" id="maso" name="maso" placeholder="Nhập id...">
                            <label for="giatien">Giá tiền</label>
                            <select id="giatien" name="giatien">
                                <option value="#">Chọn giá tiền</option>
                                <option value="duoi50">Dưới 50K</option>
                                <option value="tu50den200">Từ 50K - 200K</option>
                                <option value="tu200den500">Từ 200K - 500K</option>
                                <option value="tu500den1tr">Từ 500K - 1TR</option>
                                <option value="tren1tr">Trên 1TR</option>
                                <option value="tren5tr">Trên 5TR</option>
                            </select>
                        </div>
                        <div class="b">
                            <label for="ngoc" style="padding-left: 8px">Ngọc 90</label>
                            <select id="ngoc" name="ngoc">
                                <option value="#">-- Không chọn --</option>
                                <option value="co">Có</option>
                                <option value="khong">Không</option>
                            </select>
                            <label for="trangthai"> Trạng thái</label>
                            <select id="trangthai" name="trangthai">
                                <option value="#">-- Không chọn --</option>
                                <option value="nicktrangthongtin">Nick trắng thông tin</option>
                                <option value="nickcodt">Nick có SĐT</option>
                            </select>

                            <button type="submit" style="margin-left: 10px">Tìm kiếm</button>
                        </div>
                    </form>
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

            <div class="center">
                <div class="pagination">
                    <c:forEach begin="1" end="${endP}" var="i">
                        <a class="${cnt==i?"active":""}" href="home?index=${i}">${i}</a>
                    </c:forEach>
                </div>
            </div>


            <jsp:include page="Footer.jsp"></jsp:include>
        </div>
    </body>

</html>