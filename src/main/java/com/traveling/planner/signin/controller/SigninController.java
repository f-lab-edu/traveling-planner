package com.traveling.planner.signin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class SigninController {

    @RequestMapping(value = "signin", method = RequestMethod.POST)
    public String signin(ModelAndView mav, @RequestParam Map<String, String> info) {
        return info.toString();
    }

}
