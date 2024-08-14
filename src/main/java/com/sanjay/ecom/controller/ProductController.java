package com.sanjay.ecom.controller;

import com.sanjay.ecom.model.Product;
import com.sanjay.ecom.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ProductController {

    @Autowired
    private ProductService service;

    @RequestMapping("/")
    public String greet()
    {
        return "Api Route";
    }

    @GetMapping("/products")
    public List<Product> getProducts()
    {
        return service.getProducts();
    }
}
