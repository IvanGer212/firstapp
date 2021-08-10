package com.geekbrains.app.context.repository.Impl;

import com.geekbrains.app.context.domain.Product;
import com.geekbrains.app.context.repository.ProductRepository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductRepositoryImpl implements ProductRepository {
    private ProductRepository productRepository;

    public ProductRepositoryImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProduct() {
        return new ArrayList<>(Collections.singletonList(new Product(123,"Title",1245.234d)));

    }
}
