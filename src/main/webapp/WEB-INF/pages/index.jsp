<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<img src="resources/logo.png" width=30%>
<h1>A Web for Security Penetration Testing</h1>
<h2>Please enter the url of your system: </h2>
<form id="form" name="form" action="/submit" method="GET" onsubmit="return check();">
    系统名称: <input type="text" id="system_name" name="name" >
    <br/>
    系统URL: <input type="text" id="system_url" name="url"/>
    <input type="submit" value="提交安全测试"/>
</form>

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
