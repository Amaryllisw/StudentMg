package com.softeem.student.stuservlet;

import com.softeem.student.entity.Student;
import com.softeem.student.service.StudentService;
import com.softeem.student.service.StudentServiceImpl;
import com.softeem.student.utils.PageBean;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/pageAllInfo")
public class pageAllInfoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //获取当前页面,封装到分页实体
        String pageNum = req.getParameter("pageNum");
        if (pageNum==null){
            pageNum="1";
        }
        PageBean pageBean = new PageBean();
        pageBean.setPageNum(Integer.parseInt(pageNum));

        //条件查询开始
        String username = req.getParameter("username");
        String scoreFrom = req.getParameter("scoreFrom");
        String scoreTo = req.getParameter("scoreTo");
        String cid = req.getParameter("cid");
        //封装到pageBean
        if (username!=null){pageBean.setName(username);}  //避免赋空值
        if (scoreFrom!=null){pageBean.setScoreFrom(scoreFrom);}
        if (scoreTo!=null){pageBean.setScoreTo(scoreTo);}
        if (cid!=null){pageBean.setCid(cid);}

        //调用service（查询所有成绩：带分页）
        StudentService studentService = new StudentServiceImpl();
        List<Student> list = studentService.allInfo(pageBean);
        //将数据放到域中
        req.setAttribute("info",list);        //管理页面获取数据
        req.setAttribute("pageBean",pageBean);//分页的实体信息放入域中，再目标页面共享数据
        /// 转到管理页面admin.jsp
        req.getRequestDispatcher("admin.jsp").forward(req,resp);

    }
}
