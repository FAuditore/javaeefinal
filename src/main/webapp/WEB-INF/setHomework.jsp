<%--
  Created by IntelliJ IDEA.
  User: FAuditore
  Date: 2020/3/13
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>SetHomework</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="choose" align="center" style="width:500px">
    <h1>Set Homework</h1>
    <form action="${pageContext.request.contextPath}/teacher/setHomework" method="post">
        <table align="center" style="margin-bottom: 20px">
            <tr>
                <td >homeworkTitle:</td>
                <td><input class="default-input" type="text" name="title" required></td>
            </tr>
            <tr>
                <td >homeworkDescription:</td>
                <td><textarea cols="35" rows="10" name="content" required></textarea></td>
            </tr>
        </table>
        <button type="submit">Publish</button>
        <button type="reset">Reset</button>
    </form>
</div>
</body>
</html>
