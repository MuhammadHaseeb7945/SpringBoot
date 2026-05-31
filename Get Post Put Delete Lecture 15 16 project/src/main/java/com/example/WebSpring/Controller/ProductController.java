package com.example.WebSpring.Controller;

import com.example.WebSpring.Model.Product;
import com.example.WebSpring.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired

    Service service;
    @GetMapping ("/product")

    public List<Product> getProducts(){
        return service.getProduct();
    }
    
    @GetMapping("/product/{productId}")
    public Product getProductByID(@PathVariable int productId){
        return service.getProductByID(productId);
        }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product prod){
        service.addProduct(prod);
    }
    @PutMapping("/product")
    public void updateProduct(@RequestBody Product prd){
        service.updateProduct(prd);
    }
    @DeleteMapping("/product/{prod}")
    public void deleteProduct(@PathVariable int prod){
        service.deleteProduct(prod);
    }

    }

