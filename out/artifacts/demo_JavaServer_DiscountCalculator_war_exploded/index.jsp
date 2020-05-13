<%--
  Created by IntelliJ IDEA.
  User: Duc
  Date: 5/13/2020
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>Ứng dụng tính chiết khấu</title>
    <style>
        * {
            font-family: "Roboto Light", serif;
        }

        input {
            padding-left: 20px;
        }

        label input {
            margin: 5px;
        }
    </style>
</head>
<body>
<h1>Ứng dụng tính chiết khấu</h1>
<form action="${pageContext.request.contextPath}/result" method="post">
    <label for="name">Nhập tên sản phẩm</label>
    <input type="text" id="name" name="name">
    <br>
    <label for="list-price">Giá niêm yết:</label>
    <input type="text" id="list-price" name="input">
    <br>
    <label for="rate">Tỷ lệ chiết khấu (%): </label>
    <input type="text" id="rate" name="rate">
    <br>
    <button type="submit">Ấn vô!!</button>
</form>
</body>
</html>
