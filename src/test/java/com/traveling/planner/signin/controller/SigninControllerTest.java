package com.traveling.planner.signin.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.traveling.planner.dto.UsersDto;
import com.traveling.planner.signin.service.SigninService;
import com.traveling.planner.vo.UsersVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest
public class SigninControllerTest {

    @Autowired
    private MockMvc mockMvc;
    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void signin() throws Exception{
        UsersDto dto = new UsersDto();
        dto.setId("id");
        dto.setPassword("password123");
        dto.setName("권택현");
        dto.setEmail("denyok@naver.com");
        String content = objectMapper.writeValueAsString(dto);

        mockMvc.perform(post("/signin")
                    .content(content)
                    .contentType(MediaType.APPLICATION_JSON)
                    .accept(MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk());
    }

}