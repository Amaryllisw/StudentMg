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
import java.util.List;

@WebServlet("/allInfo")
public class AllInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       //1.查询所有成绩信息
        StudentService studentService = new StudentServiceImpl();
        List<Student> studentsList = studentService.allInfo();
        // 2.放到请求域中
        req.setAttribute("info",studentsList);
        //3. 转到管理页面admin.jsp
        req.getRequestDispatcher("admin.jsp").forward(req,resp);
    }
}
