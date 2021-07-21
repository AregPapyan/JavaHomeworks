package com.example.fourentitycrud.controller.model;

import com.example.fourentitycrud.persistence.model.Person;
import com.example.fourentitycrud.persistence.model.Product;

import javax.persistence.ManyToOne;
import java.util.List;

public class OrderRequestModel {
    private String orderNumber;
    private List<ProductOrderRequestModel> productRequestModels;
    private PersonOrderRequestModel personRequestModel;

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public List<ProductOrderRequestModel> getProductRequestModels() {
        return productRequestModels;
    }

    public void setProductRequestModels(List<ProductOrderRequestModel> productRequestModels) {
        this.productRequestModels = productRequestModels;
    }

    public PersonOrderRequestModel getPersonRequestModel() {
        return personRequestModel;
    }

    public void setPersonRequestModel(PersonOrderRequestModel personRequestModel) {
        this.personRequestModel = personRequestModel;
    }
}
