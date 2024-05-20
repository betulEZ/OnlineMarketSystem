package com.example.onlinemarketsystem.service;

import com.example.onlinemarketsystem.model.Product;
import com.example.onlinemarketsystem.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository repository;
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public List<Product> getAllProduct() {
        return repository.findAll();
    }
}
