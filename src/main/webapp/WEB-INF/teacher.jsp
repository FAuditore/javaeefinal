<%@ page import="com.javaee.homework_system.model.Teacher" %><%--
  Created by IntelliJ IDEA.
  User: FAuditore
  Date: 2020/3/13
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>teacher</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="choose">
    <%Teacher teacher=(Teacher)session.getAttribute("teacher");%>

    <h1>Hello <%=teacher.getTeacherName()%><br></h1>
    <h1>homework system</h1>
        <button type="button" style="height: 60px" onclick="location.href='${pageContext.request.contextPath}/teacher/setHomework'">
        set homework
        </button>
    <button type="button" style="height: 60px" onclick="location.href='${pageContext.request.contextPath}/teacher/reviewHomework'">
        review homework
    </button>
    <button type="button" style="margin-top: 30px; height: 60px" onclick="location.href='${pageContext.request.contextPath}/login'">Logout</button>
</div>
</body>
</html>
