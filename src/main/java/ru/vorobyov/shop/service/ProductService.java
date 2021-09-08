package ru.vorobyov.shop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.vorobyov.shop.entities.Product;
import ru.vorobyov.shop.repositories.ProductRepository;

import java.util.List;

@Service
public class ProductService {
    
    private ProductRepository productRepository;
    
    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
//    public List<Product> findAllOrderByPriceAsc() {
//        return productRepository.findAllOrderByPriceAsc();
//    }
//
//    public List<Product> findAllOrderByPriceDesc() {
//        return productRepository.findAllOrderByPriceDesc();
//    }
//
//    public List<Product> findMin() {
//        return productRepository.findAllOrderByPriceAscLimit1();
//    }
//
//    public List<Product> findMax() {
//        return productRepository.findAllOrderByPriceDescLimit1();
//    }
    
    public List<Product> findAll() {
        return productRepository.findAll();
    }
    
}
