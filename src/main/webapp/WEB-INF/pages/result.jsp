<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body >
<img src="resources/logo.png" width=30%>
<h1>please wait for your paper</h1>
<form id="form " name="form" action="/check" method="Get" onsubmit="return check();">
    您的测试报告编号为:${message }
    <br>
    输入编号查看是否扫描完成（输入格式：BOCOMMXXXXX，区分大小写）:
    <br>
    <input type="text" id="system_number" name="system_number" >
    <input type="submit" value="查询结果">
</form>
<script>
    function check(){
        if (document.getElementById("system_number").value=="") {
            alert("请输入正确编号");
            return false;
        }
        else
            return true;
    }
</script>
</body>
</html>
<html>
