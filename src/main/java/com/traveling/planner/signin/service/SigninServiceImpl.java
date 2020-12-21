package com.traveling.planner.signin.service;

import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.dao.SigninDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SigninServiceImpl implements SigninService {

    @Autowired
    SigninDao signinDao;

    public void signin(UsersDto dto) {
        signinDao.signin(dto);
    }
}
