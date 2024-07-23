package com.example.MadaaleSp_MS.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Table(name = "customer")
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String phone;
    private String address;

    @OneToMany(mappedBy = "customer")
    @JsonBackReference
    private List<Sale> sales;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @OneToMany(mappedBy = "customer")
//    @JsonBackReference
//    private List<Sale> sales;
//
//    private String name;
//    private String email;
//    private String phone;
//    private String address;


//    @Id trueeeeeee
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    private String name;
//    private String email;
//    private String phone;
//    private String address;
//
//    private LocalDateTime createdAt = LocalDateTime.now();
//    private LocalDateTime updatedAt = LocalDateTime.now();
//
//    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//    private List<Sale> sales;



    // Getters and Setters
}
