package com.spring.algorithm.domain;

import com.spring.algorithm.domain.user.User;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LoginResponseTest {

        @Test
        public void lombokTest() {
            //given
            String name = "khs9628";
            String nickname = "현수쓰";
            String pw = "qwer1234";
//            Role role = new Role('');
            //when
//            User lombokResponseDto = new User(name, nickname,pw); //필드가 포함된 생성자를 만들어주었습니다.
//
//            //then
//            assertThat(lombokResponseDto.getName()).isEqualTo(name); //get 메소드를 선언하지 않아도 getName()을 사용할 수 있습니다.
//            assertThat(lombokResponseDto.getNickname()).isEqualTo(nickname);
//            assertThat(lombokResponseDto.getPw()).isEqualTo(pw);
        }
}
//assertThat : assertj라는 테스트 검증 라이브러리로 검증합니다. isEqualTo로 값을 비교합니다.
//JUnit의 기본 assertThat이 아닌 assertj로 사용했다는 점을 주의해주세요.