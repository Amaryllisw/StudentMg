package com.softeem.student.service;

import com.softeem.student.entity.Student;
import com.softeem.student.utils.PageBean;

import java.util.List;

public interface StudentService {
    List<Student>allInfo();
    int addInfo(Student student);
    int delete(String id);
    Student getInfoById(int id);
    int update(Student student);

    //分页改进List<Student>allInfo();
    List<Student>allInfo(PageBean pageBean);

}
