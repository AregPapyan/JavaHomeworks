package com.example.fourentitycrud.controller.model;

import com.example.fourentitycrud.persistence.model.Person;
import com.example.fourentitycrud.persistence.model.Product;

import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import java.util.List;

public class OrderResponseModel {
    private Long id;
    private String orderNumber;
    private List<ProductResponseModel> productResponseModels;
    private PersonResponseModel personResponseModel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ProductResponseModel> getProductResponseModels() {
        return productResponseModels;
    }

    public void setProductResponseModels(List<ProductResponseModel> productResponseModels) {
        this.productResponseModels = productResponseModels;
    }

    public PersonResponseModel getPersonResponseModel() {
        return personResponseModel;
    }

    public void setPersonResponseModel(PersonResponseModel personResponseModel) {
        this.personResponseModel = personResponseModel;
    }
}
