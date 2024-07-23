package com.example.MadaaleSp_MS.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Sale {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id", nullable = false)
//    @JsonManagedReference
//    private Customer customer;
//
//    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
//    @JsonManagedReference
//    private List<SaleItem> saleItems;
//
//    private LocalDate saleDate;


//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", nullable = false)
//    @JsonIgnore
//    private Product product;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id", nullable = false)
//    @JsonIgnore
//    private Customer customer;
//
//    private LocalDate saleDate;
//    private int quantity;
//    private double price;

//true
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;

    private LocalDate saleDate;
    private int quantity;
    private double price;
//@Id
//@GeneratedValue(strategy = GenerationType.IDENTITY)
//private Long id;
//
//    @ManyToOne
//    @JoinColumn(name = "product_id", nullable = false)
//    @JsonManagedReference
//    private Product product;
//
//    @ManyToOne
//    @JoinColumn(name = "customer_id", nullable = false)
//    @JsonManagedReference
//    private Customer customer;
//
//    private LocalDate saleDate;
//    private int quantity;
//    private double price;
}
