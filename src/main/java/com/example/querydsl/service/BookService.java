package com.example.querydsl.service;

import com.example.querydsl.dto.BookDetailsDto;
import com.example.querydsl.dto.BookDto;
import com.example.querydsl.model.Author;
import com.example.querydsl.model.Book;
import com.example.querydsl.model.Product;
import com.example.querydsl.model.QBook;
import com.example.querydsl.model.QProduct;
import com.example.querydsl.repository.BookRepository;
import com.querydsl.core.BooleanBuilder;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@Slf4j
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public List<BookDetailsDto> getAllBooks () {
        List<Book> books =  bookRepository.findAll();
        return books
                .stream()
                .map(book ->
                {
                    return mapBookToBookDetailsDto(book);
                })
                .collect(Collectors.toList());
    }

    public List<BookDto> getBooksByAuthorName(String authorName){
        QProduct qProduct = QProduct.product;
        QBook book = QBook.book;
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(book.author.name.eq(authorName));
        List<Book> books = (List<Book>) bookRepository.findAll(booleanBuilder.getValue());

        return books
                .stream()
                .map( currentBook -> mapBookToBookDto(currentBook))
                .collect(Collectors.toList());
    }

    public BookDto mapBookToBookDto(Book book){
        BookDto bookDto = new BookDto(book.getId(), book.getTitle());
        return bookDto;
    }
    public BookDetailsDto mapBookToBookDetailsDto (Book book){
        BookDetailsDto bookDetails = new BookDetailsDto();
        bookDetails.setId(book.getId());
        bookDetails.setTitle(book.getTitle());
        bookDetails.setAuthorId(book.getAuthor().getId());
        bookDetails.setAuthorName(book.getAuthor().getName());
        return bookDetails;
    }
}
