package com.softeem.student.stuservlet;

import com.softeem.student.entity.User;
import com.softeem.student.service.UserService;
import com.softeem.student.service.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class UserServletLogin extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserService userService = new UserServiceImpl();
        User user = userService.login(username, password);
        if (user!=null){
       /*     //跳转到管理页面
            resp.sendRedirect("allInfo");//请求，跳转到servlet实现，获取所有学生成绩信息，展示到页面*/
            req.getSession().setAttribute("user", user);
            resp.sendRedirect("pageAllInfo");
        }
        else{
            resp.sendRedirect("index.jsp");
        }
    }
    }

