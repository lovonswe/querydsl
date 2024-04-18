package com.example.querydsl.repository;

import com.example.querydsl.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>, QuerydslPredicateExecutor<Book> {
}
