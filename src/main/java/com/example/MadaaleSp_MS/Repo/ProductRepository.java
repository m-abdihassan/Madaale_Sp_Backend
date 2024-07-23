package com.example.MadaaleSp_MS.Repo;

import com.example.MadaaleSp_MS.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
