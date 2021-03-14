package com.traveling.planner.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
@Setter
@ToString
public class UsersDto {
    @NotBlank(message="아이디를 입력해 주세요")
    private String id;

    @NotBlank(message="비밀번호를 입력해 주세요")
    @Length(min=8, max=16, message = "비밀번호는 8~32자 입니다")
    private String password;

    @NotBlank(message="이름을 입력해 주세요")
    private String name;

    @Email(message="아메일을 형식에 맞게 입력해 주세요")
    private String email;

}
