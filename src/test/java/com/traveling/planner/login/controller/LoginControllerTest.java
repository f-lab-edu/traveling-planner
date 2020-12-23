package com.traveling.planner.login.controller;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.Sha256;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
class LoginControllerTest {

    @Autowired
    MockMvc mockMvc;
    @Autowired
    ObjectMapper objectMapper;

    @Test
    public void login() throws Exception{
        UsersDto dto = new UsersDto();
        dto.setId("id");
        dto.setPassword("password123");

        String mapper = objectMapper.writeValueAsString(dto);

        UsersDto validation = new UsersDto();
        validation.setId("id");
        validation.setPassword(Sha256.encrypt("password123"));

        mockMvc.perform(post("/login")
                    .content(mapper)
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(assertEquals())
        ;
    }

}