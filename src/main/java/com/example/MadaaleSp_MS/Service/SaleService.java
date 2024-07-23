package com.example.MadaaleSp_MS.Service;

import com.example.MadaaleSp_MS.Entity.Sale;
import com.example.MadaaleSp_MS.Repo.SaleRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaleService {


    private final SaleRepository saleRepository;

    public SaleService(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

//    public List<Sale> getAllSales() {
//        return saleRepository.findAll();
//    }

    public Optional<Sale> getSaleById(Long id) {
        return saleRepository.findById(id);
    }

    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

//    public Sale saveSale(Sale sale) {
//        // Ensure the Sale entity is valid and all relationships are correctly set
//        if (sale.getProduct() == null || sale.getCustomer() == null) {
//            throw new IllegalArgumentException("Product and Customer must not be null");
//        }
//        return saleRepository.save(sale);
//    }

    public void deleteSale(Long id) {
        saleRepository.deleteById(id);
    }
}
