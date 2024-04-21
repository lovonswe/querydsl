package com.example.querydsl.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GProductDto {
    private String name;
    private Long quantity;
    private Long price;
    private int discount;
    private int addedInCart;
    private Date productionDate;
    private Date expiaryDate;
}
