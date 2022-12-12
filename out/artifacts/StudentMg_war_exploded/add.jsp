<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: 123
  Date: 2022/12/11
  Time: 3:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加页面</title>
    <link href="css/common.css" rel="stylesheet">
    <link href="css/content.css" rel="stylesheet">
</head>
<body>
<div class="wrapper flex">
    <c:import url="nav.jsp">
    </c:import>
    <div class="main-wrapper">
        <c:import url="top-bar.jsp">
            <c:param name="info" value="info"></c:param>
        </c:import>
        <div class="center-wrapper">
            <main class="main-box flex">
                <form action="addInfo">
                    <label>
                        姓名： <input type="text" name="username">
                    </label>
                    <br>
                    <label>
                        密码： <input type="text" name="password">
                    </label>
                    <br>
                    <label>
                        性别： <input type="text" name="sex">
                    </label>
                    <br>
                    <label>
                        年龄： <input type="text" name="age">
                    </label>
                    <br>
                    <label>
                        成绩： <input type="text" name="score">
                    </label>
                    <br>
                    <label>
                        班级： <input type="text" name="cid">
                    </label>
                    <br>
                    <label>
                        测验时间： <input type="text" name="examdate">
                    </label>
                    <br>
                    <label>
                        电话： <input type="text" name="phone">
                    </label>
                    <br>
                    <label>
                        状态： <input type="text" name="status">
                    </label>
                    <br>
                    <button type="submit">添加</button>
                </form>
            </main>
        </div>
    </div>
</div>
</body>
</html>
