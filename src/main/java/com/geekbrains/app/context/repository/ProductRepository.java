package com.geekbrains.app.context.repository;

import com.geekbrains.app.context.domain.Product;

import java.util.ArrayList;
import java.util.List;

public interface ProductRepository {

    public List<Product> getProduct();
}
