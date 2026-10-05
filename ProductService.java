package com.bakery.service;

import com.bakery.entity.Product;
import com.bakery.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public List<Product> getAll() {
        return repository.findAll();
    }

    public Product getById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found"));
    }

    public Product save(Product product) {
        return repository.save(product);
    }

    public Product update(Long id, Product data) {
        Product product = getById(id);
        product.setName(data.getName());
        product.setCategory(data.getCategory());
        product.setPrice(data.getPrice());
        product.setDescription(data.getDescription());
        product.setImageUrl(data.getImageUrl());
        product.setAvailable(data.isAvailable());
        return repository.save(product);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}
