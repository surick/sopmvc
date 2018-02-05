package example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *test
 *
 *@author w24164
 *@create 2018-02-05 11:01
 */
@Controller
@RequestMapping("home")
public class IndexController {

    @RequestMapping("index")
    public String index(){
        return "index";
    }
}
