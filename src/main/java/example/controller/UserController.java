package example.controller;

import example.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;


/**
 * ${DESCRIPTION}
 *
 * @author w24164
 * @create 2018-02-05 14:05
 */
@Controller
public class UserController {

    @RequestMapping(value = "login",method = RequestMethod.POST)
    public String login(Model model, HttpServletRequest request){
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String user_name = UserService.check(username, password);
        if(user_name != null && user_name != ""){
            model.addAttribute("msg", user_name);
            return "../views/admin/admin";
        }else{
            return "../views/login";
        }
    }

    @RequestMapping(value = "login",method = RequestMethod.GET)
    public String toLogin(){
        return "login";
    }
}
