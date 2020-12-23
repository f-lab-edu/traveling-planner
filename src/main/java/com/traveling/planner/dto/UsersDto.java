package com.traveling.planner.dto;

import com.sun.istack.internal.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.lang.NonNull;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UsersDto {
    @NotBlank(message="아이디를 입력해 주세요")
    private String id;
    @NotBlank(message="비밀번호를 입력해 주세요")
    @Length(min=8, max=16, message = "비밀번호는 8~32자 입니다")
    private String password;
    @NotBlank(message="이름을 입력해 주세요")
    private String name;
    @Email(message="아메일을 입력해 주세요")
    private String email;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "UsersDto{" +
                "id='" + id + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
