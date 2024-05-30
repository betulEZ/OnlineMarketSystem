package com.example.onlinemarketsystem.service;

import com.example.onlinemarketsystem.model.Product;
import com.example.onlinemarketsystem.repo.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public Product update(String id, Product product) {
        Product temp=repository.findById(id).orElseThrow();
        temp.setName(product.getName());
        temp.setPrice(product.getPrice());
        temp.setQuality(product.getQuality());
        return repository.save(temp);
    }

    public void deleteById(String id) {
       repository.deleteById(id);
    }
}
