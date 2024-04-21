package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StudentDetailsDto {
    private Long id;
    private String name;
    private String district;
    private String thana;
    private String courceTitle;
}
