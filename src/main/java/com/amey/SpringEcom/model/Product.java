package com.amey.SpringEcom.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // AUTO GENERATING P_KEY VALUE
    private int id;
    private String name;
    private String description;
    private String brand;
    private BigDecimal price;
    private String category;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-YY")
    // TO CONVERT DATA INTO SPECIFIC FORMAT
    private Date releaseDate;
    private boolean productAvailable;
    private int stockQuantity;

    // IMAGE TYPE COLUMN
    private String imageName;
    private String imageType;
    @Lob // LARGE BINARY OBJECTS
    private byte[] imageData;


    public Product(int id) {
        this.id = id;
    }
}
