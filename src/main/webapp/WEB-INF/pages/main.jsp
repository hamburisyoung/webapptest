<%--
  Created by IntelliJ IDEA.
  User: hambur
  Date: 2016/10/13
  Time: 下午4:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>菜鸟教程(runoob.com)</title>
</head>
<body>
<h1>使用 GET 方法读取数据</h1>
<ul>
    <li><p><b>站点名:</b>
        <%= request.getParameter("name")%>
    </p></li>
    <li><p><b>网址:</b>
        <%= request.getParameter("url")%>
    </p></li>
</ul>
</body>
</html>
