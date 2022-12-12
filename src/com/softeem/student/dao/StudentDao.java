package com.softeem.student.dao;

import com.softeem.student.entity.Student;
import com.softeem.student.utils.PageBean;

import java.sql.SQLException;
import java.util.List;

public interface StudentDao {
    //学生的登录
    Student login(String name,String password);
    //获取所有学生成绩信息
    List<Student>allInfo() throws SQLException;

    //升级：分页查询
    List<Student>allInfo(PageBean pageBean) throws SQLException;

    //升级2：条件查询
    List<Student>allInfo2(PageBean pageBean) throws SQLException;

    //添加学生
    int addInfo(Student student) throws SQLException;
    //修改：1.获取需要修改的当前学生(根据id查询信息)
    Student getInfoById(int id) throws SQLException;
    //修改：2.点击修改，提交执行修改操作
    int update(Student student) throws SQLException;
    //删除
    int delete(int id) throws SQLException;

    //分页时：获取总条数
    int totalCounts() throws SQLException;
}
