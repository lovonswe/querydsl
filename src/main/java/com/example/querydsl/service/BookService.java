package com.example.querydsl.service;

import com.example.querydsl.model.Author;
import com.example.querydsl.model.Book;
import com.example.querydsl.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks () {
        List<Book> books =  bookRepository.findAll();
        Book book = books.getFirst();
        Author author = book.getAuthor();
        String authorName = author.getName();
        log.info("{}" , book);
        return books.;
    }
}
