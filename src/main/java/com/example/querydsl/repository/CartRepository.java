package com.example.querydsl.repository;

import com.example.querydsl.model.oneToOne.unidirectional.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long>, QuerydslPredicateExecutor<Cart> {
}
