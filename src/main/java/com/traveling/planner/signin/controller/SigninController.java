package com.traveling.planner.signin.controller;

import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.Sha256;
import com.traveling.planner.signin.service.SigninService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SigninController {

    public static boolean flag = false;

    @Autowired(required = false)
    SigninService signinService;

    //postman으로 검증해야한다.
    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    @ResponseBody
    public String signin(@Validated @RequestBody UsersDto dto, BindingResult bindingResult) {
        String sha = Sha256.encrypt(dto.getPassword());
        dto.setPassword(sha);
        if (flag) {
            System.out.println(bindingResult);
            System.out.println(sha);
        }
        //signinService.signin(dto);
        return dto.toString();
    }

}
