package com.example.querydsl.service;

import com.example.querydsl.model.Product;
import com.example.querydsl.model.QProduct;
import com.example.querydsl.repository.ProductRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.QueryFactory;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProduct() {
        BooleanBuilder booleanBuilder = new BooleanBuilder();
        booleanBuilder.and(QProduct.product.name.eq("pant")).and(QProduct.product.brand.eq("Jara"));
        return (List<Product>) productRepository.findAll(booleanBuilder.getValue());
    }
}
