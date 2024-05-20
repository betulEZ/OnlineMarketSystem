package com.example.onlinemarketsystem.controller;

import com.example.onlinemarketsystem.model.Product;
import com.example.onlinemarketsystem.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/product")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService service;
    @PostMapping
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    }
    @GetMapping
    public List<Product> getAllStudents(){
        return service.getAllProduct();
    }
}
