<%--
  Created by IntelliJ IDEA.
  User: sxn
  Date: 2020/12/10
  Time: 上午11:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <script src="${pageContext.request.contextPath}/js/jquery-1.12.4.min.js"></script>
    <script>
        function x() {
            $.post({
                url:"${pageContext.request.contextPath}/x1",
                data:{
                    "name":$("#username").val()
                },
                success: function (data) {
                    alert(data);
                }
            })
        }
    </script>
</head>
<body>
用户名：<input type="text" id="username" onblur="x()">
</body>
</html>
