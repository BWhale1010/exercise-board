package com.exercise.board.domain;

import java.time.LocalDateTime;

public class ArticleComment {
    private Long id;
    private Article article; // 게시글 (ID)
    private User_account user_account; // 유저 계정 (아이디)
    private long parent_comment_id; // 부모 댓글
    private String content; // 본문
    

    private LocalDateTime createdAt; // 생성일시
    private String createBy; // 생성자
    private  LocalDateTime modifiedAt; // 수정일시
    private String modifiedBy; // 수정자
}
