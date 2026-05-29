package com.example.WebSpring.Controller;

import com.example.WebSpring.Model.Product;
import com.example.WebSpring.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    @Autowired

    Service service;
    @RequestMapping("/prod")

    public List<Product> getProducts(){
        return service.getProduct();
    }
}
