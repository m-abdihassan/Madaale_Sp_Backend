package com.example.MadaaleSp_MS.Service;


import com.example.MadaaleSp_MS.Repo.CustomerRepository;
import com.example.MadaaleSp_MS.Repo.ProductRepository;
import com.example.MadaaleSp_MS.Repo.SaleRepository;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class OverviewService {


    private final CustomerRepository customerRepository;


    private final ProductRepository productRepository;


    private final SaleRepository saleRepository;

    public OverviewService(CustomerRepository customerRepository, ProductRepository productRepository, SaleRepository saleRepository) {
        this.customerRepository = customerRepository;
        this.productRepository = productRepository;
        this.saleRepository = saleRepository;
    }


    public Map<String, Long> getOverviewData() {
        Map<String, Long> overviewData = new HashMap<>();
        overviewData.put("totalCustomers", customerRepository.count());
        overviewData.put("totalProducts", productRepository.count());
        overviewData.put("totalSales", saleRepository.count());
        return overviewData;
    }
}
