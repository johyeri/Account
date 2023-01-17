package com.example.account.domain;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor //빌더가 들어간 객체를 상속받을 수 있도록 함
@AllArgsConstructor //빌더가 들어간 객체를 상속받을 수 있도록 함
@Builder //객체생성
@Entity //설정파일
public class Account {
    @Id //PK로 지정한다는 뜻
    @GeneratedValue //sequence
    private Long id;

    private String accountNumber;

    @Enumerated(EnumType.STRING) //Enum의 실제값을 DB에 저장함
    private AccountStatus accountStatus;
}
