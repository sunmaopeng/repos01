<%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2019/4/24
  Time: 11:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/find">hellow word</a>
    <form action="/account/save" method="get">
        姓名: <input type="text" name="name">
        金钱: <input type="text" name="money">
        <input type="submit" value="提交">
    </form>
</body>
</html>
