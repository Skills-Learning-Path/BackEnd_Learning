<%--
  Created by IntelliJ IDEA.
  User: sxn
  Date: 2020/12/10
  Time: 下午3:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/upload" enctype="multipart/form-data" method="post">
    <input type="file" name="file"/>
    <input type="submit">
</form>
<form action="${pageContext.request.contextPath}/download" method="get">
    <input type="text" name="fileName">
    <input type="submit">
</form>
</body>
</html>
