package com.stackroute.controller;

import com.stackroute.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UserController {

    @RequestMapping("/")
    public String getUser(ModelMap modelMap) {

        User user = new User();
        ModelAndView modelAndView = new ModelAndView();
        user.setName("indu");
        modelMap.addAttribute("username", user.getName());
        return "display";
    }

}
