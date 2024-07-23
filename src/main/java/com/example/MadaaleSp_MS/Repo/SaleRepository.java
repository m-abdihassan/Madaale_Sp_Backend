package com.example.MadaaleSp_MS.Repo;

import com.example.MadaaleSp_MS.Entity.Sale;
import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;


@Repository
public interface SaleRepository extends JpaRepository<Sale, Long> {
}
