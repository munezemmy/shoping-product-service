package service;


import model.Product;

import java.util.List;

public interface ProductService {

    public Product getProductById(long id);
    public List<Product> getAllProducts();
    public Product saveProduct(Product product);
}
