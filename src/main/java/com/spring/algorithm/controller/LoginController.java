package com.spring.algorithm.controller;

import com.spring.algorithm.domain.user.Role;
import com.spring.algorithm.domain.user.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

@RestController
public class LoginController {

    @GetMapping("/hello")
    public String hello() {
        return "hello Spring Boot!";
    }

    @GetMapping("/hello/dto")
    public User helloResponseDto(@RequestParam("id") Long id, @RequestParam("name") String name, @RequestParam("nickname") String nickname , @RequestParam("pw") String pw, @RequestParam("email") String email, @RequestParam("role")  Role role) {
        return new User(id ,name, nickname, pw, email, role);
    }
}
//@RequestParam : 외부에서 API로 넘긴 파라미터(@RequestParam("name"), @RequestParam("nickname"), , @RequestParam("pw]"))를 가져와 String name, String nickname, String pw에 각각 저장