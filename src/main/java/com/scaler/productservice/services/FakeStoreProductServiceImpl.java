package com.scaler.productservice.services;

import com.scaler.productservice.dtos.FakeStoreProductDTO;
import com.scaler.productservice.models.Category;
import com.scaler.productservice.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;


@Service
public class FakeStoreProductServiceImpl implements ProductService {

   private RestTemplate restTemplate;

    FakeStoreProductServiceImpl(RestTemplate restTemplate) {
       this.restTemplate = restTemplate;
   }
    @Override
    public List<Product> getAllProducts() {
        FakeStoreProductDTO[] listOfProducts=restTemplate.getForObject("https://fakestoreapi.com/products",FakeStoreProductDTO[].class);
        List<Product> products=new ArrayList<>();
        for(FakeStoreProductDTO product:listOfProducts){
            products.add(convertFakeProductDTOToProduct(product));
        }
        return products;
    }
    private Product convertFakeProductDTOToProduct(FakeStoreProductDTO fakeStoreProductDTO) {
       Product product = new Product();
       product.setId(fakeStoreProductDTO.getId());
       product.setDescription(fakeStoreProductDTO.getDescription());
       product.setPrice(fakeStoreProductDTO.getPrice());
       product.setTitle(fakeStoreProductDTO.getTitle());
       product.setImage_url(fakeStoreProductDTO.getImage());

        Category category=new Category();
        category.setTitle(fakeStoreProductDTO.getCategory());
        product.setCategory(category);
       return product;
    }
    @Override
    public Product getProductById(Long id) {
       FakeStoreProductDTO fakeStoreProductDTO=
               restTemplate.getForObject("https://fakestoreapi.com/products/"+ id, FakeStoreProductDTO.class);
     if(fakeStoreProductDTO==null)return null;

     return convertFakeProductDTOToProduct(fakeStoreProductDTO);
    }

    @Override
    public Product createProduct(Product product) {
        return null;
    }

    @Override
    public Product replaceProduct(Long id, Product product) {
        return null;
    }

    @Override
    public Product updateProduct(Long id, Product product) {
        return null;
    }

    @Override
    public void deleteProduct(Long id) {

    }
    
}
