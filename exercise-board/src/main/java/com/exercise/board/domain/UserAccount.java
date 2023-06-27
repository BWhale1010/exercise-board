package com.exercise.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
        @Index(columnList = "email", unique = true),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createdBy")
})
@Entity
public class UserAccount extends AuditingFields{
    @Id
    @Column(length = 50)
    private long userId; // 유저 아이디

    @Setter
    @Column(nullable = false)
    private String user_password; // 유저 암호

    @Setter
    @Column(length = 100)
    private String email; // 이메일

    @Setter
    @Column(length = 100)
    private String nickname; // 닉네임

    @Setter
    private String memo; // 메모

    protected UserAccount(){}


}
