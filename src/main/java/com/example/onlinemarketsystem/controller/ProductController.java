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
    @PutMapping("/{id}")
    public Product update(@PathVariable String id,@RequestBody Product product) {
        return service.update(id, product);
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable String id){
        service.deleteById(id);
    }

}
