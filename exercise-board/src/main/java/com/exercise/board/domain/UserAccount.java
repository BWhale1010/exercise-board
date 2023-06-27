package com.exercise.board.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Objects;

@Getter
@ToString(callSuper = true)
@Table(indexes = {
        @Index(columnList = "email", unique = true),
        @Index(columnList = "createdAt"),
        @Index(columnList = "createBy")
})
@Entity
public class UserAccount extends AuditingFields{
    @Id
    @Column(length = 50)
    private String userId; // 유저 아이디

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

    public UserAccount(String userId, String user_password, String email, String nickname, String memo, String createBy) {
        this.userId = userId;
        this.user_password = user_password;
        this.email = email;
        this.nickname = nickname;
        this.memo = memo;
        this.createBy = createBy;
        this.modifiedBy = createBy;
    }

    public static UserAccount of(String userId, String userPassword, String email, String nickname, String memo) {
        return UserAccount.of(userId, userPassword, email, nickname, memo, null);
    }

    public static UserAccount of(String userId, String userPassword, String email, String nickname, String memo, String createdBy) {
        return new UserAccount(userId, userPassword, email, nickname, memo, createdBy);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UserAccount that)) return false;
        return this.getUserId() != null && this.getUserId().equals(that.getUserId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getUserId());
    }
}
