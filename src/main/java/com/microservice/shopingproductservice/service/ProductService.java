package com.microservice.shopingproductservice.service;


import com.microservice.shopingproductservice.model.Product;

import java.util.List;

public interface ProductService {

    public Product getProductById(long id);
    public List<Product> getAllProducts();
    public Product saveProduct(Product product);
}
