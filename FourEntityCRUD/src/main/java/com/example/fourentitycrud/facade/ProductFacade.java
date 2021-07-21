package com.example.fourentitycrud.facade;

import com.example.fourentitycrud.controller.model.ProductRequestModel;
import com.example.fourentitycrud.controller.model.ProductResponseModel;
import com.example.fourentitycrud.converter.ProductConverter;
import com.example.fourentitycrud.persistence.model.Product;
import com.example.fourentitycrud.service.ProductService;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductFacade {
    private ProductService productService;

    public ProductFacade(ProductService productService) {
        this.productService = productService;
    }
    public List<ProductResponseModel> getAll(){
        List<Product> products = productService.getAll();
        return ProductConverter.productListIntoResponseModelList(products);
    }
    public ProductResponseModel getById(Long id){
        Product product = productService.getById(id);
        return ProductConverter.productIntoResponseModel(product);
    }
    public ProductResponseModel create(ProductRequestModel request){
        Product product = productService.create(ProductConverter.requestModelIntoProduct(request));
        return ProductConverter.productIntoResponseModel(product);
    }
    public ProductResponseModel update(Long id, ProductRequestModel request){
        Product product = productService.update(id, ProductConverter.requestModelIntoProduct(request));
        return ProductConverter.productIntoResponseModel(product);
    }
    public ProductResponseModel delete(Long id){
        return ProductConverter.productIntoResponseModel(productService.delete(id));
    }
}
