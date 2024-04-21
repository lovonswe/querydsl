package com.example.querydsl.repository;

import com.example.querydsl.model.oneToOne.unidirectional.GProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface GProductRepository extends JpaRepository<GProduct, Long>, QuerydslPredicateExecutor<GProduct> {
}
