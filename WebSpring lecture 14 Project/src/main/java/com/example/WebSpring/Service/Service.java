package com.example.WebSpring.Service;

import com.example.WebSpring.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Service {
    List<Product> product= Arrays.asList(
      new Product(10,"Dell",100),
      new Product(21,"Hp",210),
      new Product(22,"Lenovo",100),
      new Product(23,"Azzure",210)
    );
    public List<Product> getProduct(){
        return product;
    }
}
