package com.exercise.board.domain;

import java.time.LocalDateTime;

public class Hashtag {
    private long id;
    private String hashtag_name; // 해시태그 이름
    private LocalDateTime createdAt; // 생성일시
    private String createBy; // 생성자
    private  LocalDateTime modifiedAt; // 수정일
    private String modifiedBy; // 수정자

}
