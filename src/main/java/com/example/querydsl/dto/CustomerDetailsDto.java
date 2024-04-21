package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerDetailsDto {
    private String name;
    private String phone;
    private String district;
    private String thana;
    private String road;
    private String house;
}
