<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<body>
<img src="WEB-INF/pages/bgpicture.jpg" width=100%>
<h1>A Web for Security Penetration Testing</h1>
<h2>Please enter the url of your system: </h2>
<form id="form" name="form" action="/submit" method="GET" onsubmit="return check();">
    aaaa系统名: <input type="text" id="aaa" name="name" >
    <br/>
    系统URL: <input type="text" name="url"/>
    <input type="submit" value="提交安全测试"/>
</form>

<script>
    function check(){
        if(document.getElementById("aaa").value== ""){
            alert("error");
            return false;
        }
        return true;
    }
</script>
</body>
</html>
<html>
