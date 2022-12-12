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

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //接收删除的请求，并且接受ID 调用service ，根据id删除
        String id = req.getParameter("id");
        StudentService studentService=new StudentServiceImpl();
        int i = studentService.delete(id);

        resp.sendRedirect("pageAllInfo");
    }
}
