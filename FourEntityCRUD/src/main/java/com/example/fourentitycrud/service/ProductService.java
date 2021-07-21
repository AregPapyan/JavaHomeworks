package com.example.fourentitycrud.service;

import com.example.fourentitycrud.persistence.ProductRepository;
import com.example.fourentitycrud.persistence.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private ProductRepository productRepository;

    //Constructor
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAll(){
        return productRepository.findAll();
    }
    public Product getById(Long id){
        return productRepository.getById(id);
    }
    public Product create(Product product){
        return productRepository.save(product);
    }
    public Product update(Long id, Product product){
        Product byId = productRepository.getById(id);
        byId.setName(product.getName());
        byId.setType(product.getType());
        return productRepository.save(byId);
    }
    public Product delete(Long id){
        Product byId = productRepository.getById(id);
        productRepository.deleteById(id);
        return byId;
    }
}
