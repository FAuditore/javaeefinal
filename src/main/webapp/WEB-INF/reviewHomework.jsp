<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.javaee.homework_system.model.SubmitHomework" %>
<%@ page import="java.util.List" %>
<%@ page import="com.javaee.homework_system.model.Homework" %>
<%@ page import="com.javaee.homework_system.model.Teacher" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ReviewHomework</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
<div class="choose" style="width: 1000px">
    <%Teacher teacher=(Teacher)session.getAttribute("teacher");%>
    <h1><%=teacher.getTeacherName()%> set</h1>
    <table align="center" width="960" cellpadding="1" cellspacing="1">
        <tr align="center"  height="50">
            <td>homeworkId</td>
            <td>homeworkTitle</td>
            <td>describe</td>
            <td>createTime</td>
        </tr>
        <%List<Homework> lh = (List<Homework>) request.getAttribute("lh");
            if (null == lh || lh.size() <= 0) {
                out.print("None data.");
            } else {
                for (Homework h : lh) {
        %>
        <tr align="center" bgcolor="white" height="30">
            <td><%=h.getHomeworkId()%>
            </td>
            <td><%=h.getHomeworkTitle()%>
            </td>
            <td><%=h.getHomeworkContent()%>
            </td>
            <td><%=h.getCreateTime()%>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
</div>
<div class="choose" style="width: 1000px">
    <h1>Review</h1>
<table align="center" width="960" cellpadding="1" cellspacing="1">
    <tr align="center"  height="50">
        <td>homeworkId</td>
        <td>homeworkTitle</td>
        <td>studentName</td>
        <td>submitContent</td>
        <td>submitTime</td>
    </tr>
    <%
        List<SubmitHomework> list = (List<SubmitHomework>) request.getAttribute("lsh");
        if (null == list || list.size() <= 0) {
            out.print("None data.");
        } else {
            for (SubmitHomework h : list) {
    %>
    <tr align="center" bgcolor="white" height="30">
        <td><%=h.getHomeworkId()%>
        </td>
        <td><%=h.getHomeworkTitle()%>
        </td>
        <td><%=h.getStudentName()%>
        </td>
        <td><%=h.getSubmitContent()%>
        </td>
        <td><%=h.getSubmitTime()%>
        </td>
    </tr>
    <%
            }
        }
    %>
</table>
    <br>
    <button type="button" onclick="location.href='${pageContext.request.contextPath}/teacher/'">Go back</button>
</div>
</body>
</html>
