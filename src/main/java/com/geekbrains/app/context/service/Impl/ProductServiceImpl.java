package com.geekbrains.app.context.service.Impl;

import com.geekbrains.app.context.domain.Product;
import com.geekbrains.app.context.repository.ProductRepository;
import com.geekbrains.app.context.service.ProductService;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProduct() {
        return productRepository.getProduct();
    }
}
