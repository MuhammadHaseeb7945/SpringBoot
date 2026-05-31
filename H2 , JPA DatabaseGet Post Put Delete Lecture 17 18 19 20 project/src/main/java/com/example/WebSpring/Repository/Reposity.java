package com.example.WebSpring.Repository;

import com.example.WebSpring.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Reposity extends JpaRepository<Product, Integer> {
}