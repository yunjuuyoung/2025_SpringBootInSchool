package hs.kr.study.Board.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class CommentDto {
    private int id;
    private String commentWriter;
    private String commentContents;
    private int boardId;
    private LocalDateTime commentCreatedTime;
}
