package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**Indicates this is a controller class*/
@Controller
public class UserController {

    /**RequestMapping annotation maps HTTP requests to handler methods*/
    @RequestMapping("/")
    public String getUser(ModelMap modelMap) {

        /**Creates object to User*/
        User user = new User();
        /**Set name of user*/
        user.setName("suresh");
        /**UserController will pass user object to view*/
        modelMap.addAttribute("username", user.getName());
        return "display";
    }

}
