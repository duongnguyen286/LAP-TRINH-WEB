<%-- 
    Document   : EditAccount
    Created on : May 16, 2023, 6:47:56 PM
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
            button:hover {
                opacity: 0.5;
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
            select,
            input{
                width: 100%;
                height: 40px;
                padding: 0;
            }

        </style>
    </head>
    <body>
        <h1>Chỉnh sửa Account <h1 style="color: red"> ${account.username} </h1></h1>
        <a href="home"> <button>HOME</button> </a>
        <form action="editaccount" method="post">
            <table>
                <tr>
                    <th>UID</th>
                    <th><input class="id" style="background-color: #ccc; border: none" value="${account.uID}" type="text" name="uID" readonly required ></th>
                </tr>
                <tr>
                    <th>USER NAME</th>
                    <th><input value="${account.username}" type="text" name="username" required></th>
                </tr>

                <tr>
                    <th>PASS</th>
                    <th><input value="${account.pass}" type="text" name="pass" required></input></th>
                </tr>
                <tr>
                    <th>EMAIL</th>
                    <th><input value="${account.email}" type="text" name="email" required></th>
                </tr>
                <tr>
                    <th>QUYỀN HẠN</th>
                    <th>
                        <select name="isAdmin">
                            <option value="0">USER</option>
                            <option value="1" ${account.isAdmin == 1 ? "selected" : ""}>ADMIN</option>
                        </select>
                    </th>
                </tr>
            </table>

            <button type='submit'>SAVE</button>
        </form>
        <a href="qlaccount"> <button>CANCEL</button> </a>

    </body>
</html>