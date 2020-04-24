package com.microservice.shopingproductservice.controllerTest;

import com.microservice.shopingproductservice.controller.ProductController;
import com.microservice.shopingproductservice.model.Product;
import com.microservice.shopingproductservice.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ProductControllerTest {
    @InjectMocks
    ProductController controller;

    @Mock
    ProductService service;

    @Mock
    Product product;

    private static final long id=10;

    @Test
    public void getOneProductTest(){
        Mockito.when(service.getProductById(id)).thenReturn(product);
        Assertions.assertEquals(controller.getOneProduct(id), product);

    }
}
