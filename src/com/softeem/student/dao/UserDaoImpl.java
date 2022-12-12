package com.softeem.student.dao;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.softeem.student.entity.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;

public class UserDaoImpl implements UserDao{
    QueryRunner qr = new QueryRunner(new ComboPooledDataSource());
    @Override
    public User login(String name, String password) throws SQLException {
        String sql ="select * from user where uname =? and password = ?";
         return  qr.query(sql,new BeanHandler<User>(User.class),name,password);
    }
}
