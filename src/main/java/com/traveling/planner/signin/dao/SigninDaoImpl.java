package com.traveling.planner.signin.dao;

import com.traveling.planner.dto.UsersDto;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class SigninDaoImpl implements SigninDao {

    @Autowired
    SqlSessionTemplate mybatis;

    @Override
    public void signin(UsersDto dto) {
        mybatis.insert("sign", dto);
    }
}
