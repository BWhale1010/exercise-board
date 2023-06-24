package com.exercise.board.domain;

import java.time.LocalDateTime;

public class Article {
    private Long id;
    private User_account user_account; // 유저 계정 (아이디)
    private String title; // 제목
    private String content; // 본문
    private LocalDateTime createdAt; // 생성일시
    private String createBy; // 생성자
    private  LocalDateTime modifiedAt; // 수정일
    private String modifiedBy; // 수정자


}
