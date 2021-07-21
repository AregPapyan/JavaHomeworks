package com.example.fourentitycrud.persistence;

import com.example.fourentitycrud.persistence.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
