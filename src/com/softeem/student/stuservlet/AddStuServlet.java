package com.softeem.student.stuservlet;

import com.softeem.student.dao.StudentDao;
import com.softeem.student.entity.Student;
import com.softeem.student.service.StudentService;
import com.softeem.student.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addInfo")
public class AddStuServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从页面接收前端的请求，添加信息，封装到student对象中，调用service方法
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String sex = req.getParameter("sex");
        String age = req.getParameter("age");
        String score = req.getParameter("score");
        String cid = req.getParameter("cid");
        String examdate = req.getParameter("examdate");
        String phone = req.getParameter("phone");
        String status = req.getParameter("status");
        //封装到student对象中
        Student s = new Student(username,password,sex,Integer.parseInt(age),Float.parseFloat(score)
                ,Integer.parseInt(cid),examdate,phone,Integer.parseInt(status));
        //调用service方法
        StudentService studentService = new StudentServiceImpl();
        int i = studentService.addInfo(s);
        resp.sendRedirect("pageAllInfo");
    }
}
