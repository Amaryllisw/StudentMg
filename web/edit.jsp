<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="com.softeem.student.entity.Student" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>修改页面</title>
    <link href="css/common.css" rel="stylesheet">
    <link href="css/content.css" rel="stylesheet">
</head>
<body>

<%
    Student student = (Student) request.getAttribute("student");
%>
<div class="wrapper flex">
    <c:import url="nav.jsp">
    </c:import>
    <div class="main-wrapper">
        <c:import url="top-bar.jsp">
            <c:param name="info" value="info"></c:param>
        </c:import>
        <div class="center-wrapper">
            <main class="main-box flex">
                <form action="updateSubmit">
                    <label>
                        姓名： <input type="text" name="username" value="<%=student.getSname()%>">
                    </label>
                    <br>
                    <label>
                        密码： <input type="text" name="password" value="<%=student.getPassword()%>">
                    </label>
                    <br>
                    <label>
                        性别： <input type="text" name="sex"value="<%=student.getSex()%>">
                    </label>
                    <br>
                    <label>
                        年龄： <input type="text" name="age"value="<%=student.getAge()%>">
                    </label>
                    <br>
                    <label>
                        成绩： <input type="text" name="score"value="<%=student.getScore()%>">
                    </label>
                    <br>
                    <label>
                        班级： <input type="text" name="cid" value="<%=student.getCid()%>">
                    </label>
                    <br>
                    <label>
                        测验时间： <input type="text" name="examdate" value="<%=student.getExamdate()%>">
                    </label>
                    <br>
                    <label>
                        电话： <input type="text" name="phone" value="<%=student.getPhone()%>">
                    </label>
                    <br>
                    <label>
                        状态： <input type="text" name="status" value="<%=student.getStatus()%>">
                    </label>
                    <br>
                    <button type="submit">提交修改</button>
                </form>
            </main>
        </div>
    </div>
</div>
</body>
</html>
