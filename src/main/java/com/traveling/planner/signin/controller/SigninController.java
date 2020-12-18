package com.traveling.planner.signin.controller;

import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.Sha256;
import com.traveling.planner.signin.service.SigninService;
import com.traveling.planner.vo.UsersVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class SigninController {

    @Autowired
    SigninService signinService;

    @RequestMapping(value = "signin", method = RequestMethod.POST)
    @ResponseBody
    public String signin(ModelAndView mav, UsersDto dto) {
        String sha = Sha256.encrypt(dto.getPassword());
        dto.setPassword(sha);
        signinService.signin(dto);
        System.out.println(sha);
        return dto.toString();
    }

}
