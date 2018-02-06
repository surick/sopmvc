package com.ljg.common.service.user.impl;

import com.ljg.common.model.User;
import com.ljg.common.service.user.UserService;
import com.ljg.common.mapper.user.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-06 15:27
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserByNameAndPwd(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userMapper.getUserInfo(user);
    }
}
