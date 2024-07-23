package com.example.MadaaleSp_MS.Repo;


import com.example.MadaaleSp_MS.Entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

}