package com.example.querydsl.repository;

import com.example.querydsl.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>,
        QuerydslPredicateExecutor<Product> {

}
