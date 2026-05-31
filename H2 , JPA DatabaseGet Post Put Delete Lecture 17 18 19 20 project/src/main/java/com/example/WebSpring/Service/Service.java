package com.example.WebSpring.Service;

import com.example.WebSpring.Repository.Reposity;
import com.example.WebSpring.Model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
//    List<Product> product= new ArrayList<>(Arrays.asList(
//      new Product(10,"Dell",100),
//      new Product(21,"Hp",210),
//      new Product(22,"Lenovo",100),
//      new Product(23,"Azzure",210)
//    ));
    @Autowired
    Reposity repo;
    public List<Product> getProduct(){
        return repo.findAll();
    }

// this is used to fetch the product by thier ids
    public Product getProductByID(int productId) {
        return repo.findById(productId).orElse(null);
//         product.stream()
//                .filter(p->p.getProductId()==productId)
//                .findFirst().orElse(new Product(10,"dummy",201));
//
   }
    // add product
    public void addProduct(Product prod){
        repo.save(prod);
//        product.add(prod);
    }


    public void updateProduct(Product prd) {
//        int index =0;
//        for(int i=0;i<product.size();i++){
//            if(product.get(i).getProductId()==prd.getProductId()){
//                index=i;
//            }
//        }
//        product.set(index,prd);
        repo.save(prd);
    }

    public void deleteProduct(int prod) {
//        int index=0;
//        for (int i=0;i<product.size();i++){
//            if(product.get(i).getProductId()==prod){
//                index=i;
//            }
//        }
//        product.remove(index);
        repo.deleteById(prod);
    }
}
