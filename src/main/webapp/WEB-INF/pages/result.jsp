<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body >
<img src="resources/logo.png" width=30%>
<h1>please wait for your paper</h1>
<form id="form " name="form" action="/check" method="Get">
    the number of this paper is:${message }
    <br>
    input the number to check if the test is over:<input type="text" id="system_number" name="system_number">
    <input type="submit" value="查询结果">
</form>
</body>
</html>
<html>
