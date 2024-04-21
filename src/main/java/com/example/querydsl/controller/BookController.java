package com.example.querydsl.controller;

import com.example.querydsl.dto.BookDetailsDto;
import com.example.querydsl.dto.BookDto;
import com.example.querydsl.model.Book;
import com.example.querydsl.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<BookDetailsDto>> getAllBooks () {
        List<BookDetailsDto> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @GetMapping("/{authorName}")
    public ResponseEntity<List<BookDto>> getBooksByAuthorName(@PathVariable String authorName){
        return new ResponseEntity<>(bookService.getBooksByAuthorName(authorName), HttpStatus.OK);
    }
}
