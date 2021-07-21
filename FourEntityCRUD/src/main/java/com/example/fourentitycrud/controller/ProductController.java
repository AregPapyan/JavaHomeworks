package com.example.fourentitycrud.controller;

import com.example.fourentitycrud.controller.model.PersonRequestModel;
import com.example.fourentitycrud.controller.model.PersonResponseModel;
import com.example.fourentitycrud.controller.model.ProductRequestModel;
import com.example.fourentitycrud.controller.model.ProductResponseModel;
import com.example.fourentitycrud.facade.ProductFacade;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private ProductFacade facade;

    //Constructor
    public ProductController(ProductFacade facade) {
        this.facade = facade;
    }

    @GetMapping(value = "/product")
    public ResponseEntity<List<ProductResponseModel>> getAll(){
        return ResponseEntity.ok(facade.getAll());
    }

    @GetMapping(value = "/product/{id}")
    public ResponseEntity<ProductResponseModel> getById(@PathVariable Long id){
        return ResponseEntity.ok(facade.getById(id));
    }

    @PostMapping(value = "/product")
    public ResponseEntity<ProductResponseModel> create(@RequestBody ProductRequestModel request){
        return ResponseEntity.ok(facade.create(request));
    }
    @PutMapping(value = "/product/{id}")
    public ResponseEntity<ProductResponseModel> update(@PathVariable Long id, @RequestBody ProductRequestModel request){
        return ResponseEntity.ok(facade.update(id, request));
    }
    @DeleteMapping(value = "/product/{id}")
    public ResponseEntity<ProductResponseModel> delete(@PathVariable Long id){
        return ResponseEntity.ok(facade.delete(id));
    }
}
