package com.example.fourentitycrud.converter;

import com.example.fourentitycrud.controller.model.OrderRequestModel;
import com.example.fourentitycrud.controller.model.OrderResponseModel;
import com.example.fourentitycrud.persistence.model.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderConverter {
    public static List<OrderResponseModel> orderListIntoResponseModelList(List<Order> orders){
        List<OrderResponseModel> responses = new ArrayList<>();
        for(Order order:orders){
            OrderResponseModel response = new OrderResponseModel();
            response.setId(order.getId());
            response.setOrderNumber(order.getOrderNumber());
            response.setProductResponseModels(ProductConverter.productListIntoResponseModelList(order.getProducts()));
            response.setPersonResponseModel(PersonConverter.personIntoResponseModel(order.getPerson()));
        }
        return responses;
    }
    public static OrderResponseModel orderIntoResponseModel(Order order){
        OrderResponseModel response = new OrderResponseModel();
        response.setId(order.getId());
        response.setOrderNumber(order.getOrderNumber());
        response.setProductResponseModels(ProductConverter.productListIntoResponseModelList(order.getProducts()));
        response.setPersonResponseModel(PersonConverter.personIntoResponseModel(order.getPerson()));
        return response;
    }
    public static Order requestModelIntoOrder(OrderRequestModel request){
        Order order = new Order();
        order.setOrderNumber(request.getOrderNumber());
        order.setProducts(ProductConverter.requestModelListIntoProductList(request.getProductRequestModels()));
        order.setPerson(PersonConverter.orderRequestModelIntoPerson(request.getPersonRequestModel()));
        return order;
    }
}
