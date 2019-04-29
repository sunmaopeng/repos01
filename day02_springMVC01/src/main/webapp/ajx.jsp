<%--
  Created by IntelliJ IDEA.
  User: J
  Date: 2019/4/22
  Time: 18:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>发送异步请求</title>
    <script src="./js/jquery.min.js"></script>
    <script>
        $(function () {
            $("#bt").click(function () {
                alert("aaa")
                $.ajax({
                    url:"text3",
                    contentType:"application/json;charset=UTF-8",
                    data:'{"name":"张撒","sex":"男","id":1}',
                    dataType:"json",
                    type:"post",
                    success:function (data) {
                        alert(data.name);
                    }
                })
            })
        })
    </script>
</head>
<body>
    <button id="bt">发送一步请求</button>
</body>
</html>
