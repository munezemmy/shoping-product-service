package com.microservice.shopingproductservice.controller;

import com.microservice.shopingproductservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.microservice.shopingproductservice.service.ProductService;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/products/{id}")
    public Product getOneProduct(@PathVariable("id") long id) {

        return productService.getProductById(id);
    }


    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @PostMapping("products")
    public Product saveProduct(@RequestBody Product product) {

        return productService.saveProduct(product);
    }

    @GetMapping("/test")
    public String test(){
        return "hello this a test";
    }
}
