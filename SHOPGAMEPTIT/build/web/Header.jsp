<%-- 
    Document   : Header
    Created on : May 12, 2023, 8:33:29 PM
    Author     : Duong Nguyen
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="header">
    <a class="logo" href="home">SHOPGAMEPTIT</a>
    <ul class="nav">
        <li>
            <a href="home">TRANG CHỦ</a>
        </li>
        <c:if test="${sessionScope.account == null}">
            <li>
                <a href="./Login.jsp">ĐĂNG NHẬP</a>
            </li>
            <li>
                <a href="./Register.jsp">ĐĂNG KÝ</a>
            </li>
        </c:if> 

        <c:if test="${sessionScope.account.isAdmin ==1}">
            <li>
                <a href="qlsp">ADMIN</a>
            </li>
        </c:if> 
        <c:if test="${sessionScope.account != null}">
            <li>
                <a id="xacnhan" href="#">NẠP VÍ - ATM</a>
            </li>
            <li>
                <a href="NapThe.jsp">NẠP THẺ</a>
            </li>
            <li>
                <a href="history">LỊCH SỬ</a>
            </li>
            <li>
                <a style="color: red" href="history">${account.username} ۰ ${sessionScope.account.sodu}đ</a>
            </li>
            <li>
                <a href="logout">ĐĂNG XUẤT</a>
            </li>
        </c:if> 
    </ul>
</div>
