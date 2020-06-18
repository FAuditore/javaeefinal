<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User.xml: FAuditore
  Date: 2020/6/17
  Time: 10:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
    <title>Register</title>
</head>
<body>
<div class="choose">
<h1>Register</h1>
<form action="${pageContext.request.contextPath}/register" method="post">
    <table align="center" style="margin-bottom: 10px">
        <tr>
            <td>userId:</td>
            <td><input type="text" onkeyup="this.value=this.value.replace(/\D/g, '')" class="default-input" name=userid autofocus="autofocus" required></td>
        </tr>
        <tr>
            <td>username:</td>
            <td><input type="text" class="default-input" name=username required></td>
        </tr>
        <tr>
            <td>password:</td>
            <td><input type="text" class="default-input" name=password required></td>
        </tr>
        <tr>
            <select name="usertype" class="type">
                <option value="1">I'm a student</option>
                <option value="2">I'm a teacher</option>
            </select>
        </tr>
    </table>
    <button type="submit">Register</button>
    <button type="reset" >Reset</button>
</form>
</div>
</body>
</html>
