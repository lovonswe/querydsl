package com.example.querydsl.controller;

import com.example.querydsl.dto.GProductDto;
import com.example.querydsl.model.oneToOne.unidirectional.GProduct;
import com.example.querydsl.service.GProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/gproducts")
public class GProductController {
    @Autowired
    private GProductService gProductService;

    @PostMapping
    public ResponseEntity<GProduct> addNewProduct(@RequestBody GProductDto product) {
        return new ResponseEntity<>(gProductService.addNewProduct(product), HttpStatus.OK);
    }

}
