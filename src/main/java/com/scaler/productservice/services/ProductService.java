package com.scaler.productservice.services;

import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface ProductService {
    //coding to interface to make our service class loosely coupled and avoid dependency inversion
    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product createProduct(Product product);
    Product replaceProduct(Long id, Product product);
    Product updateProduct(Long id, Product prqqqqoduct);
    void deleteProduct(Long id);
}
