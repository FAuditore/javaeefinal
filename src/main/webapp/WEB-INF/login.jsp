<%--
  Created by IntelliJ IDEA.
  User: FAuditore
  Date: 2020/6/17
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
<div class="choose">
    <h1>Homework System</h1>
    <h3><%if(session.getAttribute("message")!=null){
    %>
        <%=session.getAttribute("message")%>
    <%}%>
   </h3>
    <form action="${pageContext.request.contextPath}/login" method="post" >
        <table align="center" style="margin-bottom: 5px">
            <tr>
                <td>username</td>
                <td><input type="text" class="default-input" name="username" placeholder="Username" required></td>
            </tr>
                <td>password</td>
                <td><input type="password" class="default-input" name="password" placeholder="Password" required></td>
        </table>
        <select name="usertype" class="type">
            <option value=1>I'm a student</option>
            <option value=2>I'm a teacher</option>
        </select>
        <br>
    <button type="submit">Login</button>
    <button type="button" onclick="location.href='${pageContext.request.contextPath}/register'">Register</button>
    </form>
</div>
</body>
</html>

