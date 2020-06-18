<%@ page import="com.javaee.homework_system.model.Homework" %><%--
  Created by IntelliJ IDEA.
  User: FAuditore
  Date: 2020/3/13
  Time: 19:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>EditHomework</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
<div class="choose" align="center" style="width:1000px">
    <h1>Edit Homework</h1>
    <table align="center" width="960" cellpadding="1" cellspacing="1">
        <tr align="center"  height="50">
            <td>homeworkId</td>
            <td>homeworkTitle</td>
            <td>teacherName</td>
            <td>describe</td>
            <td>createTime</td>
        </tr>
        <%
            Homework h = (Homework) request.getAttribute("homework");
            if (null == h) {
                out.print("None data.");
            } else {
        %>
        <tr align="center" bgcolor="white" height="30">
            <td><%=h.getHomeworkId()%>
            </td>
            <td><%=h.getHomeworkTitle()%>
            </td>
            <td><%=h.getTeacherName()%>
            </td>
            <td><%=h.getHomeworkContent()%>
            </td>
            <td><%=h.getCreateTime()%>
            </td>
        </tr>
        <%
            }
        %>
    </table>
    </div>
<div class="choose" align="center" style="width:1000px">
    <form method="post">
        <table align="center" style="margin-up: 20px">
            <tr>
                <td >Edit your content:</td>
            </tr>
            <tr>
                <%String cotent = (String) request.getAttribute("content");%>
                <td><textarea class="default-input" cols="50" rows="10" name="content"  required><%=cotent%></textarea></td>
            </tr>
        </table>
        <button type="submit">Submit</button>
        <button type="reset">Reset</button>
    </form>
</div>
</body>
</html>
