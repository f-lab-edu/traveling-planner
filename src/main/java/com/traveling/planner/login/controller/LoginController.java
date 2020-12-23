package com.traveling.planner.login.controller;


import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.Sha256;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class LoginController {

    @RequestMapping(value="/login", method=RequestMethod.POST)
    @ResponseBody
    public String login(@RequestBody UsersDto dto, BindingResult bindingResult){
        String sha = Sha256.encrypt(dto.getPassword());
        dto.setPassword(sha);
        /*int result = loginService.login(dto);
        if(result==1){
            return "Login success"+ dto.toString();
        }
        */
        return dto.toString();
    }
}
