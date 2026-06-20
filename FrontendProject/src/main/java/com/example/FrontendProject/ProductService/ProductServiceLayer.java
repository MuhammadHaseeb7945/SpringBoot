package com.example.FrontendProject.ProductService;

import com.example.FrontendProject.Model.Product;
import com.example.FrontendProject.ProductRepository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Service
public class ProductServiceLayer {
@Autowired
    ProductRepo repo;
    public List<Product> getProduct() {
    return repo.findAll();
    }

    public Product getProductById(int prdId) {
        return repo.findById(prdId).orElse(null);
    }


    public Product addProduct(Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());

        return repo.save(product);

    }


    public void updateProduct(int productId, Product product, MultipartFile imageFile) throws IOException {
        product.setImageName(imageFile.getOriginalFilename());
        product.setImageType(imageFile.getContentType());
        product.setImageData(imageFile.getBytes());
        repo.save(product);
    }

    public void deleteProduct(int productId) {
        repo.deleteById(productId);
    }

    public List<Product> searchProduct(String keyword) {
     return  repo.searchProduct(keyword);
    }
}
