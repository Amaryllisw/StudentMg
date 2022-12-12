package com.softeem.student.service;

import com.softeem.student.entity.User;

public interface UserService {
    User login(String name , String password);
}
