package com.example.querydsl.model.oneToOne.unidirectional;

import com.querydsl.core.annotations.QueryEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@QueryEntity
public class GProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private Long quantity;
    private Long price;
    private int discount;
    private int addedInCart;
    private Date productionDate;
    private Date expiaryDate;
}
