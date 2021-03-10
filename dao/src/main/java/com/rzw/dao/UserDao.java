package com.rzw.dao;

import com.rzw.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {
    void add(User user);
    User get(String name);
}
