package com.softeem.student.stuservlet;

import com.softeem.student.entity.Student;
import com.softeem.student.service.StudentService;
import com.softeem.student.service.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/updateEdit")
public class UpdateEditServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        StudentService studentService = new StudentServiceImpl();
        Student student = studentService.getInfoById(Integer.parseInt(id));
        //将查询需要的修改信息 放到域中
        req.setAttribute("student",student);
        req.getRequestDispatcher("edit.jsp").forward(req,resp);
    }
}
