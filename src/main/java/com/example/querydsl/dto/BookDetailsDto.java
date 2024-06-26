package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BookDetailsDto {
    private Long id ;
    private String title;
    private Long authorId;
    private String authorName;
}
