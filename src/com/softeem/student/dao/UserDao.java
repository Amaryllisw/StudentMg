package com.softeem.student.dao;

import com.softeem.student.entity.User;

import java.sql.SQLException;

public interface UserDao {
    //登录 : 根据输入的用户名和密码  返回用户（管理员和学生）  查找数据库书否存在
    User login(String name,String password) throws SQLException;
}
