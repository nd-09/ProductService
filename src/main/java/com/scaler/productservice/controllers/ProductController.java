package com.scaler.productservice.controllers;

import com.scaler.productservice.models.Product;
import com.scaler.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService productService;

     ProductController(ProductService productService) {
         this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id){
//        return new Product();
        return productService.getProductById(id);
    }
    @GetMapping
    public List<Product> getAllProducts(){
        return productService.getAllProducts();
    }
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return new Product();
    }
    @PutMapping("/{id}")
    //complete update
    public Product replaceProduct(@PathVariable("id")Long id,@RequestBody Product product){
        return new Product();
    }
    @PatchMapping("/{id}")
     // partial update
    public Product updateProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return new Product();
    }
    @DeleteMapping
    public void deleteProduct(@RequestBody Long id){
        return;
    }
}
