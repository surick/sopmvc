package com.ljg.common.service.user;

import com.ljg.common.model.User;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-06 15:26
 */
public interface UserService {
    User getUserByNameAndPwd(String username, String password);
}
