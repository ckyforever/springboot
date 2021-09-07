package com.example.springboot02.service;

import com.example.springboot02.model.User;

import java.util.List;

/**
 * @author cky
 * @date 2021.09.07 18:23
 */
public interface UserService {
    List<User> selectAllUser();
    int insertUser(User user);
}
