package com.example.querydsl.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
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
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date productionDate;
    @JsonFormat(pattern="yyyy-MM-dd")
    private Date expiaryDate;
}
