<%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2019/4/20
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%--<a href="/text">hellow word</a>--%>
    <form action="/text" method="get">
        编号 <input type="text" name="id"><br>
        姓名 <input type="text" name="name"><br>
        金钱 <input type="text" name="money"><br>
        时间 <input type="text" name="date"><br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
