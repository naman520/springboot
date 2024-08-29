package com.helloworld.demo.View;

import com.helloworld.demo.Model.Product;
import java.util.List;

import org.springframework.stereotype.Service;

import java.util.Arrays;


@Service
public class ProductService {
    
    List<Product> products = Arrays.asList(new Product(101, "Apple",2000), new Product(102, "Applae",200));

    public List<Product> getProducts(){
        return products;
    }
    
}
