package com.example2.demo.domain;

import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
public class Board {
    private Long boardId;
    private String title;
    private String content;
    private String name;
    private LocalDateTime createDate;
    private int read;
    private Long memberId;


}