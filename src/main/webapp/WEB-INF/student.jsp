<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="com.javaee.homework_system.model.SubmitHomework" %>
<%@ page import="java.util.List" %>
<%@ page import="com.javaee.homework_system.model.Homework" %>
<%@ page import="com.javaee.homework_system.model.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Homework</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css" />
</head>
<body>
<div class="choose" style="width: 1000px">
    <%Student student=(Student)session.getAttribute("student");%>
    <h1>Hello <%=student.getStudentName()%><br> Teahcer's homework</h1>
    <table align="center" width="960" cellpadding="1" cellspacing="1">
        <tr align="center"  height="50">
            <td>homeworkId</td>
            <td>teacherName</td>
            <td>homeworkTitle</td>
            <td>describe</td>
            <td>createTime</td>
            <td>operation</td>
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
            <td><%=h.getTeacherName()%>
            </td>
            <td><%=h.getHomeworkTitle()%>
            </td>
            <td><%=h.getHomeworkContent()%>
            </td>
            <td><%=h.getCreateTime()%>
            </td>
            <td>
               <button style="height: 45px"onclick="location.href='${pageContext.request.contextPath}/student/editHomework/<%=h.getHomeworkId()%>'">check</button>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
</div>
<div class="choose" style="width: 1000px">
    <h1>My Submit</h1>
    <h1 style="color: crimson;font-size: 35px"><%if(session.getAttribute("message")!=null){
    %>
        <%=session.getAttribute("message")%>
        <%}%>
    </h1>
    <table align="center" width="960" cellpadding="1" cellspacing="1">
        <tr align="center"  height="50">
            <td>homeworkId</td>
            <td>homeworkTitle</td>
            <td>submitContent</td>
            <td>submitTime</td>
            <td>operation</td>
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
            <td><%=h.getSubmitContent()%>
            </td>
            <td><%=h.getSubmitTime()%>
            </td>
            <td>
                <button style="height: 45px"onclick="location.href='${pageContext.request.contextPath}/student/editHomework/<%=h.getHomeworkId()%>'">edit</button>
            </td>
        </tr>
        <%
                }
            }
        %>
    </table>
    <br>
    <button type="button"  onclick="location.href='${pageContext.request.contextPath}/login/'">Logout</button>
</div>
</body>
</html>
