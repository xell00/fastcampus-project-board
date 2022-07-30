package com.fastcampus.projectboard.domain;

public class ArticleComment {
    private Long id;
    private Article article;    // 게시글 (ID)
    private String content;     // 댓글

    private LocalDateTime createdAt;    // 생성일시
    private String createdBy;           // 생성자
    private LocalDateTime modifiedAt;   // 수정일시
    private String modifiedBy;          // 수정자
}
