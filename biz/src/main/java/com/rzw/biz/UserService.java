package com.rzw.biz;

import com.rzw.entity.User;

public interface UserService {
    void add(User user);
    User get(String name);
}
