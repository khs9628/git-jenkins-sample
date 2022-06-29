package com.spring.algorithm.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.Matchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

public class LoginControllerTest {

    @Autowired
    private MockMvc mvc;

//    @Test
//    public void hello_Test() throws Exception {...}

    @Test
    public void helloDto_Test() throws Exception {
        String name = "khs9628";
        String nickname = "현수쓰";
        String pw = "qwer1234";

        mvc.perform(
                get("/hello/dto")
                        .param("name", name)
                        .param("nickname", nickname)
                        .param("pw", pw))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name", is(name)))
                .andExpect(jsonPath("$.nickname", is(nickname)))
                .andExpect(jsonPath("$.pw", is(pw)));
    }
}

//param : API 테스트할 때 요청 파라미터를 설정값은 String 값만 허용됩니다.
//jsonPath : JSON 응답값을 필드별로 검증할 수 있는 메소드 $를 기준으로 필드명 명시

