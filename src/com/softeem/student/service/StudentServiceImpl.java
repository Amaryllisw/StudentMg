package com.softeem.student.service;

import com.softeem.student.dao.StudentDao;
import com.softeem.student.dao.StudentDaoImpl;
import com.softeem.student.entity.Student;
import com.softeem.student.utils.PageBean;

import java.sql.SQLException;
import java.util.List;

public class StudentServiceImpl implements StudentService{
    StudentDao studentDao= new StudentDaoImpl();

    @Override
    public List<Student> allInfo() {
        List<Student>list=null;

        try {
            list = studentDao.allInfo();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public int addInfo(Student student) {
        int i = 0;
        try {
            i = studentDao.addInfo(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public int delete(String id) {
        int i = 0;
        try {
            i = studentDao.delete(Integer.parseInt(id));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    @Override
    public Student getInfoById(int id) {
        Student s = null;
        try {
            s= studentDao.getInfoById(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return s;
    }

    @Override
    public int update(Student student) {
        int i = 0;
        try {
            i = studentDao.update(student);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return i;
    }

    //分页的实现
    @Override
    public List<Student> allInfo(PageBean pageBean) {
        //分页操作：现有数据 pageNum(当前页由页面传递)  每页条数
        //        剩下2个页数：总页数totalPages  totalCounts(查询数据表)
        //首先获取 总条数 select count(*) from student
        int count = 0;
        try {
            count = studentDao.totalCounts();
            pageBean.setTotalCounts(count); //将分页要素封装到分页实体中
        } catch (SQLException e) {
            e.printStackTrace();
        }
        int size = pageBean.getPageSize();
        //        总页数=总条数/每页条数  除不尽？
        int totalPages =(count%size)==0?(count/ size):(count/ size+1);
        pageBean.setTotalPages(totalPages);
        //调用dao 查询所有成绩信息（带分页）
        List<Student> list = null;
        try {
            //list = studentDao.allInfo(pageBean); 分页
            list = studentDao.allInfo2(pageBean); //条件查询
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }
}
