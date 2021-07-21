package com.example.fourentitycrud.controller;

import com.example.fourentitycrud.controller.model.OrderRequestModel;
import com.example.fourentitycrud.controller.model.OrderResponseModel;
import com.example.fourentitycrud.facade.OrderFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {
    private OrderFacade facade;

    //Constructor
    public OrderController(OrderFacade facade) {
        this.facade = facade;
    }

    @GetMapping(value = "/order")
    public ResponseEntity<List<OrderResponseModel>> getAll(){
        return ResponseEntity.ok(facade.getAll());
    }
    @GetMapping(value = "/order/{id}")
    public ResponseEntity<OrderResponseModel> getById(@PathVariable Long id){
        return ResponseEntity.ok(facade.getById(id));
    }
    @PostMapping(value = "/order")
    public ResponseEntity<OrderResponseModel> create(@RequestBody OrderRequestModel request){
        return ResponseEntity.ok(facade.create(request));
    }
    @PutMapping(value = "/order/{id}")
    public ResponseEntity<OrderResponseModel> update(@PathVariable Long id, @RequestBody OrderRequestModel request){
        return ResponseEntity.ok(facade.update(id,request));
    }
    @DeleteMapping(value = "/order/{id}")
    public ResponseEntity<OrderResponseModel> delete(@PathVariable Long id){
        return ResponseEntity.ok(facade.delete(id));
    }
}
