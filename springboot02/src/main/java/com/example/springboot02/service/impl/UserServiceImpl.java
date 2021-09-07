package com.example.springboot02.service.impl;

import com.example.springboot02.mapper.UserMapper;
import com.example.springboot02.model.User;
import com.example.springboot02.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cky
 * @Description: UserService的实现类
 * @date 2021.09.07 18:24
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;


    @Override
    /**
     * @description: 查询所有的用户
     * @params  * @param
     * @return java.util.List<com.example.springboot02.model.User>
     */
    public List<User> selectAllUser() {
        return userMapper.select();
    }

    @Override
    /**
     * @description: 添加用户
     * @params  * @param user
     * @return int
     */
    public int insertUser(User user) {
        return userMapper.insert(user);
    }
}
