<%@ page import="com.softeem.student.utils.PageBean" %>
<%@ page import="com.softeem.student.entity.Student" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>学生成绩管理页面</title>
    <link href="css/common.css" rel="stylesheet">
    <link href="css/content.css" rel="stylesheet">
</head>
<body>
<%
    List<Student> info = (List<Student>)request.getAttribute("info");
    PageBean pageBean =(PageBean)request.getAttribute("pageBean");
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
                <div class="form-box">
                    <form action="pageAllInfo">
                        <label>
                            姓名：<input type="text" name = "username" value="<%=pageBean.getName()%>">
                        </label>
                        <label>
                            成绩：<input type="text" name = "scoreFrom" value="<%=pageBean.getScoreFrom()%>"> - <input type="text" name = "scoreTo" value="<%=pageBean.getScoreTo()%>">
                        </label>
                        <label>
                            班级：<input type="text" name = "cid" value="<%=pageBean.getCid()%>">
                        </label>
                        <button type="submit">查询</button>

                    </form>
                </div>
                <div class="table-box">
                    <table class="info-table" border="1">
                        <tr>
                            <td>编号</td>
                            <td>姓名</td>
                            <td>密码</td>
                            <td>性别</td>
                            <td>年龄</td>
                            <td>成绩</td>
                            <td>班级</td>
                            <td>测验时间</td>
                            <td>电话</td>
                            <td>状态</td>
                            <td>操作</td>
                        </tr>
                        <%
                            for (Student s:info){
                        %>
                        <tr>
                            <td><%=s.getSno()%></td>
                            <td><%=s.getSname()%></td>
                            <td><%=s.getPassword()%></td>
                            <td><%=s.getSex()%></td>
                            <td><%=s.getAge()%></td>
                            <td><%=s.getScore()%></td>
                            <td><%=s.getCid()%></td>
                            <td><%=s.getExamdate()%></td>
                            <td><%=s.getPhone()%></td>
                            <td><%=s.getStatus()%></td>
                            <td><a href="updateEdit?id=<%=s.getSno()%>">修改</a> || <a href="delete?id=<%=s.getSno()%>">删除</a></td>
                        </tr>
                        <%
                            }
                        %>
                    </table>
                    <div class="page-box">
                        <a href="pageAllInfo?pageNum=1">首页</a>
                        <a href="pageAllInfo?pageNum=<%=pageBean.getPageNum()>1?pageBean.getPageNum()-1:1%>">上一页</a>
                        <a href="pageAllInfo?pageNum=<%=pageBean.getPageNum()<pageBean.getTotalPages()?pageBean.getPageNum()+1:pageBean.getTotalPages()%>">下一页</a>
                        <a href="pageAllInfo?pageNum=<%=pageBean.getTotalPages()%>">尾页</a>
                        第<%=pageBean.getPageNum()%> / <%=pageBean.getTotalPages()%>>页
                    </div>
                </div>
            </main>
        </div>
    </div>
</div>
</body>
</html>
