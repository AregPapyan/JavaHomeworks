package com.example.fourentitycrud.service;

import com.example.fourentitycrud.persistence.OrderRepository;
import com.example.fourentitycrud.persistence.model.Address;
import com.example.fourentitycrud.persistence.model.Order;
import com.example.fourentitycrud.persistence.model.Person;
import com.example.fourentitycrud.persistence.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    private OrderRepository orderRepository;

    //Constructor
    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<Order> getAll(){
        return orderRepository.findAll();
    }
    public Order getById(Long id){
        return orderRepository.getById(id);
    }
    public Order create(Order order){
        return orderRepository.save(order);
    }
    public Order update(Long id, Order order){
        Order byId = orderRepository.getById(id);

        List<Product> byIdProducts = byId.getProducts();
        List<Product> orderProducts = order.getProducts();
        for(int i = 0; i < byIdProducts.size(); i++){
            byIdProducts.get(i).setName(orderProducts.get(i).getName());
            byIdProducts.get(i).setType(orderProducts.get(i).getType());
        }
        byId.setProducts(byIdProducts);

        Person byIdPerson = byId.getPerson();
        Person orderPerson = order.getPerson();
        byIdPerson.setFirstName(orderPerson.getFirstName());
        byIdPerson.setLastName(orderPerson.getLastName());
        byIdPerson.setAge(orderPerson.getAge());
        byIdPerson.setUsername(orderPerson.getUsername());
        byIdPerson.setPassword(orderPerson.getPassword());

        Address byIdPersonAddress = byIdPerson.getAddress();
        Address orderPersonAddress = orderPerson.getAddress();
        byIdPersonAddress.setCountry(orderPersonAddress.getCountry());
        byIdPersonAddress.setCity(orderPersonAddress.getCity());
        byIdPersonAddress.setStreet(orderPersonAddress.getStreet());
        byIdPersonAddress.setHouseNumber(orderPersonAddress.getHouseNumber());
        byIdPerson.setAddress(byIdPersonAddress);
        byId.setPerson(byIdPerson);

        byId.setOrderNumber(order.getOrderNumber());

        return orderRepository.save(byId);
    }
    public Order delete(Long id){
        Order byId = orderRepository.getById(id);
        orderRepository.deleteById(id);
        return byId;
    }
}
