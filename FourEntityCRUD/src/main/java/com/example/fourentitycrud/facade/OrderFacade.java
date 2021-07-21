package com.example.fourentitycrud.facade;

import com.example.fourentitycrud.controller.model.OrderRequestModel;
import com.example.fourentitycrud.controller.model.OrderResponseModel;
import com.example.fourentitycrud.converter.OrderConverter;
import com.example.fourentitycrud.persistence.model.Order;
import com.example.fourentitycrud.service.OrderService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class OrderFacade {
    private OrderService orderService;

    //Constructor
    public OrderFacade(OrderService orderService) {
        this.orderService = orderService;
    }
    public List<OrderResponseModel> getAll(){
        List<Order> orders = orderService.getAll();
        return OrderConverter.orderListIntoResponseModelList(orders);
    }
    public OrderResponseModel getById(Long id){
        Order order = orderService.getById(id);
        return OrderConverter.orderIntoResponseModel(order);
    }
    public OrderResponseModel create(OrderRequestModel request){
        Order order = orderService.create(OrderConverter.requestModelIntoOrder(request));
        return OrderConverter.orderIntoResponseModel(order);
    }
    public OrderResponseModel update(Long id,OrderRequestModel request){
        Order order = orderService.update(id, OrderConverter.requestModelIntoOrder(request));
        return OrderConverter.orderIntoResponseModel(order);
    }
    public OrderResponseModel delete(Long id){
        return OrderConverter.orderIntoResponseModel(orderService.delete(id));
    }
}
