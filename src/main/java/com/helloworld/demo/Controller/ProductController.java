package com.helloworld.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.helloworld.demo.View.ProductService;
import com.helloworld.demo.Model.Product;
import java.util.*;

import org.springframework.web.bind.annotation.RequestMapping;



@RestController
public class ProductController {
    
    @Autowired
    ProductService service;

    @RequestMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }

}