package com.example.fourentitycrud.persistence;

import com.example.fourentitycrud.persistence.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order,Long> {
}
