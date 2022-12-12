package com.softeem.student.service;


import com.softeem.student.dao.UserDao;
import com.softeem.student.dao.UserDaoImpl;
import com.softeem.student.entity.User;

import java.sql.SQLException;

public class UserServiceImpl implements UserService {
    UserDao userDao = new UserDaoImpl();
    @Override
    public User login(String name, String password) {
        User u = null;
        try {
            u = userDao.login(name, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return u;
    }
}
