package com.example.MadaaleSp_MS.Entity;




import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "product")
@Entity
public class Product {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String description;
//    private double price;
//    private int stockQuantity;
//
//    @OneToMany(mappedBy = "product")
//    @JsonBackReference
//    private List<SaleItem> saleItems;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany(mappedBy = "product")
//    @JsonBackReference
//    private List<Sale> sales;
//
//    private String name;
//    private String description;
//    private double price;
//    private int stockQuantity;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "product")
    @JsonBackReference
    private List<Sale> sales;

    private String name;
    private String description;
    private BigDecimal cost;
    private int stockQuantity;

    private LocalDateTime createdAt = LocalDateTime.now();
    private LocalDateTime updatedAt = LocalDateTime.now();

      @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
      private List<Sale> Sales;


//    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
//    private List<OrderItem> orderItems;

    // Getters and Setters
}
