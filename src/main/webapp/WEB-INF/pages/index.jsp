<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body text-align:center;>
<img src="resources/logo.png" width=30%>
<h1>A Web for Security Penetration Testing</h1>
<h2>输入系统名称和IP地址: </h2>
<form id="form" name="form" action="/submit" method="GET" onsubmit="return check();">
    新建扫描任务名称：<input type="text" id="system_name" name="name" >
    <br/>
    &nbsp&nbsp&nbsp&nbsp
    系&nbsp统&nbspURL&nbsp:&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp <input type="text" id="system_url" name="url"/>
    <input type="submit" value="提交安全测试"/>
</form>
<br/>
${message}
<script>
    function check(){

        if(document.getElementById("system_name").value== ""){
            alert("error,the system name is empty!");
            return false;
        }
        else if (document.getElementById("system_url").value==""){
            alert("error,the url is empty!");
            return false;
        }else {
            return true;
        }
    }
</script>

<script src="resources/jquery-2.2.4/jquery-2.2.4.min.js"></script>

</body>
</html>
<html>
