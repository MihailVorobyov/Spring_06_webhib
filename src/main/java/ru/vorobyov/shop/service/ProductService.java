package ru.vorobyov.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vorobyov.shop.entities.Product;
import ru.vorobyov.shop.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    
    @Autowired
    private ProductRepository productRepository;
    
    public List<Product> fromMin(double min) {
        return productRepository.findByPriceAfter(min);
    }

    public List<Product> toMax(double max) {
        return productRepository.findByPriceBefore(max);
    }

    public List<Product> fromMinToMax(double min, double max) {
        return productRepository.findByPriceAfterAndPriceBefore(min, max);
    }
    
}
