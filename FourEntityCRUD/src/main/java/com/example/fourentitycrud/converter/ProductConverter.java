package com.example.fourentitycrud.converter;

import com.example.fourentitycrud.controller.model.ProductOrderRequestModel;
import com.example.fourentitycrud.controller.model.ProductRequestModel;
import com.example.fourentitycrud.controller.model.ProductResponseModel;
import com.example.fourentitycrud.persistence.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductConverter {
    public static List<ProductResponseModel> productListIntoResponseModelList(List<Product> products){
        List<ProductResponseModel> responses = new ArrayList<>();
        for(Product product:products){
            ProductResponseModel response = new ProductResponseModel();
            response.setId(product.getId());
            response.setName(product.getName());
            response.setType(product.getType());
            responses.add(response);
        }
        return responses;
    }
    public static List<Product> requestModelListIntoProductList(List<ProductOrderRequestModel> requests){
        List<Product> products = new ArrayList<>();
        for(ProductOrderRequestModel request:requests){
            Product product = new Product();
            product.setId(request.getId());
            product.setName(request.getName());
            product.setType(request.getType());
            products.add(product);
        }
        return products;
    }
    public static ProductResponseModel productIntoResponseModel(Product product){
        ProductResponseModel response = new ProductResponseModel();
        response.setId(product.getId());
        response.setName(product.getName());
        response.setType(product.getType());
        return response;
    }
    public static Product requestModelIntoProduct(ProductRequestModel request){
        Product product = new Product();
        product.setName(request.getName());
        product.setType(request.getType());
        return product;
    }
}
