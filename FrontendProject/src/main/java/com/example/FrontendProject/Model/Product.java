package com.example.FrontendProject.Model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.text.Format;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date releaseDate;
    private Boolean available;
    private Integer stockQuantity;
    private  String imageName;
    private String imageType;
    @Lob
     private byte[] imageData;

}
