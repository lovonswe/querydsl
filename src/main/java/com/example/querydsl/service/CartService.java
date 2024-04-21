package com.example.querydsl.service;

import com.example.querydsl.dto.ProductIdDto;
import com.example.querydsl.model.oneToOne.unidirectional.Cart;
import com.example.querydsl.model.oneToOne.unidirectional.GProduct;
import com.example.querydsl.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;
    @Autowired
    private GProductService gProductService;

    public void addNewCart( ProductIdDto productIds) {
        Cart cart = new Cart();
        List<GProduct> productsAddedInCart =
        productIds
                .getIds()
                .stream()
                .map(id -> {

                    try {
                        return gProductService.getProductById(id);
                    }catch(Exception e){
                        System.out.println(e);
                    }
                    return new GProduct();
        }).collect(Collectors.toList());
        cart.setProducts(productsAddedInCart);
        cartRepository.save(cart);
    }
}
