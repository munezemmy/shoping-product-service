package com.microservice.shopingproductservice.serviceImp;

import com.microservice.shopingproductservice.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.microservice.shopingproductservice.repository.ProductRepository;
import com.microservice.shopingproductservice.service.ProductService;

import java.util.List;

@Service
public class ProductImp implements ProductService {

    @Autowired
    ProductRepository repository;

    @Override
    public Product getProductById(long id) {
        return repository.findById(id).get() ;
    }

    @Override
    public List<Product> getAllProducts() {
        return (List<Product>) repository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
}
