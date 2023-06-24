package com.exercise.board.domain;

import java.time.LocalDateTime;

public class User_account {

    private long userId; // 유저 아이디
    private String user_password; // 유저 암호
    private String email; // 이메일
    private String nickname; // 닉네임
    private String memo; // 메모
    private LocalDateTime createdAt; // 생성일시
    private String createBy; // 생성자
    private  LocalDateTime modifiedAt; // 수정일
    private String modifiedBy; // 수정자
}
