package com.spring.algorithm.domain.user;

import lombok.*;

import javax.persistence.*;


@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //sequence, auto_increment

    @Column(nullable = false, length = 30)
    private String username; //아이디

    @Column(nullable = false, length = 100)
    private String password;

    @Column(nullable = false, length = 50)
    private String email;

    @Column(nullable = false, length = 50)
    private String nickname; //닉네임

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;
}

//@NoArgsConstructor : Lombok 어노테이션으로 빈 생성자를 만들어줍니다.
//@Entity : 해당 클래스가 엔티티를 위한 클래스이며, 해당 클래스의 인스턴스들이 JPA로 관리되는 엔티티 객체라는 것을 의미합니다. 즉, 테이블을 의미합니다.
//          디폴트값으로 클래스의 카멜케이스 이름을 언더스코어 네이밍(_)으로 테이블 이름을 매칭합니다.
//@Id : 테이블의 Primary Key(PK)
//@GeneratedValue(strategy = GenerationType.IDENTITY) : PK를 자동으로 생성하고자 할 때 사용합니다. 즉, auto_increment를 말합니다. 여기서는 JPA의 넘버링 전략이 아닌 이 전략을 사용합니다. (전에 application.yml 설정에서 use-new-id-generate-mappings: false로 한 것이 있습니다.)
//@Column : 해당 필드가 컬럼이라는 것을 말하고, @Column에는 다양한 속성을 지정할 수 있습니다. (nullable = false: null값이 되면 안된다!, length = 50: 길이 제한 등등)
//@Enumerated(EnumType.STRING) : JPA로 DB에 저장할 때 Enum 값을 어떤 형태로 저장할지를 결정합니다.
//        기본적으로는 int로 저장하지만 int로 저장하면 무슨 의미인지 알 수가 없기 때문에 문자열로 저장될 수 있도록 설정합니다.
//        User 클래스 Setter가 없는 이유는 이 setter를 무작정 생성하게 되면 해당 클래스의 인스턴스가 언제 어디서 변해야하는지 코드상으로는 명확하게 알 수가 없어 나중에는 변경시에 매우 복잡해집니다.
//        Builder를 사용하는 이유는 어느 필드에 어떤 값을 채워야하는지 명확하게 알 수 있기 때문에 실수가 나지 않습니다.