package com.traveling.planner.signin.controller;

import com.traveling.planner.vo.UsersVO;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

@RunWith(SpringRunner.class)
@WebMvcTest
class SigninControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    public UsersVO signin() {
        mockMvc.perform(post("/signin"))
                .andDo(print())
                .
    }

}