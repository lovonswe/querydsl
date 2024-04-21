package com.example.querydsl.controller;

import com.example.querydsl.dto.ProductIdDto;
import com.example.querydsl.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    private CartService cartService;

    @PostMapping
    public void addNewCart (@RequestBody ProductIdDto productIdDto) {
        cartService.addNewCart(productIdDto);
    }
}
