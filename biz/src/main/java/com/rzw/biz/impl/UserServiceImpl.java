package com.rzw.biz.impl;

import com.rzw.biz.UserService;
import com.rzw.dao.UserDao;
import com.rzw.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }
    @Override
    public User get(String name) {
        return userDao.get(name);
    }
}
