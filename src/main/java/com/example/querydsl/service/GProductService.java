package com.example.querydsl.service;

import com.example.querydsl.dto.GProductDto;
import com.example.querydsl.model.oneToOne.unidirectional.GProduct;
import com.example.querydsl.repository.GProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

@Service
public class GProductService {
    @Autowired
    private GProductRepository gProductRepository;

    public GProduct addNewProduct(GProductDto product) {
        GProduct gProduct = mapGProductDtoToGProduct(product);
        gProduct = gProductRepository.save(gProduct);
        return gProduct;
     }

     public GProduct getProductById(Long id) throws ChangeSetPersister.NotFoundException {
        return gProductRepository
                .findById(id)
                .orElseThrow(()-> new ChangeSetPersister.NotFoundException());
     }

     public GProduct mapGProductDtoToGProduct(GProductDto product){
        GProduct gProduct = new GProduct();
        gProduct.setName(product.getName());
        gProduct.setQuantity(product.getQuantity());
        gProduct.setPrice(product.getPrice());
        gProduct.setDiscount(product.getDiscount());
        gProduct.setProductionDate(product.getProductionDate());
        gProduct.setExpiaryDate(product.getExpiaryDate());
        return gProduct;
     }
}
