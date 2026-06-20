package com.example.FrontendProject.Controller;

import com.example.FrontendProject.Model.Product;
import com.example.FrontendProject.ProductRepository.ProductRepo;
import com.example.FrontendProject.ProductService.ProductServiceLayer;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@RestController

@CrossOrigin  // cross origin resource sharing eror ko khtm krta ha

public class ProductController {
    @Autowired
    ProductServiceLayer service;
    @GetMapping("/product")
    public ResponseEntity<List<Product> >getProduct(){
     return new ResponseEntity<>(service.getProduct() , HttpStatus.OK);
    }
    @GetMapping("/product/{prdId}")
    public ResponseEntity<Product> getProduct(@PathVariable int prdId){
        Product prod = service.getProductById(prdId);
        if(prod!=null){
            return new ResponseEntity<>(service.getProductById(prdId), HttpStatus.OK);
        }
      else {
          return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }



    }
    @PostMapping("/product")
    public ResponseEntity<?> addProduct(@RequestPart Product product, @RequestPart MultipartFile imageFile)  {
        System.out.println("Controller hit");
        try{
        Product product1 = service.addProduct(product,imageFile);
        System.out.println(product1);
        return new ResponseEntity<>(product1,HttpStatus.CREATED);}
        catch(Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
//    public ResponseEntity<?> addProduct(@RequestPart Product product,@RequestPart MultipartFile imageFile){
//       try{ Product product1 = service.addProduct(product,imageFile);
//           return new ResponseEntity<>(product1,HttpStatus.CREATED);
//       }
//       catch (Exception e){
//           return new ResponseEntity<>(product, HttpStatus.INTERNAL_SERVER_ERROR);
//       }
//
//    }
    @GetMapping("/product/{productId}/image")
    public ResponseEntity<byte[]> getProductImage(@PathVariable int productId){
       Product product=service.getProductById(productId);
       byte[] image=product.getImageData();
       return ResponseEntity.ok()
               .contentType(MediaType.valueOf(product.getImageType()))
               .body(image);

    }
    @PutMapping("/product/{productId}")
    public ResponseEntity<String> updateProduct(@PathVariable int productId,@RequestPart Product product, @RequestPart MultipartFile imageFile ) throws IOException {
        Product product1= service.getProductById(productId);
        if(product1!=null) {
            service.updateProduct(productId,product,imageFile);
            return new ResponseEntity<String>("Updated successfully",HttpStatus.OK);
        }
        else {
            return new ResponseEntity<String>("fAILED TO UPDATE",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/product/{productId}")
    public ResponseEntity<String> deleteProduct(@PathVariable int productId){
        Product product1= service.getProductById(productId);
        if(product1!=null){
            service.deleteProduct(productId);
            return new ResponseEntity<>("Deleted" , HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>("Item not exists",HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

   @GetMapping("/product/search")
    public ResponseEntity<List<Product>> searchProduct(@RequestParam String keyword){
        List<Product> product1= service.searchProduct(keyword);
        return new ResponseEntity<>(product1,HttpStatus.OK);

   }

}
