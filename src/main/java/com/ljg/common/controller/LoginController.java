package com.ljg.common.controller;

import com.ljg.common.model.User;
import com.ljg.common.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-06 16:39
 */
@Controller
public class LoginController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public String loginGet(){
        return "login";
    }
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String loginCheck(@RequestParam String username,@RequestParam String password){
        User user = userService.getUserByNameAndPwd(username,password);
        if(user != null){
            return "../jsp/admin/index";
        }else {
            return "../jsp/error/403";
        }

    }
}
