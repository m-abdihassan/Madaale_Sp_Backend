package com.example.MadaaleSp_MS.Usercontroler;

import com.example.MadaaleSp_MS.Entity.Sale;
import com.example.MadaaleSp_MS.Service.SaleService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/sales")
public class SaleController {


    private final SaleService saleService;

    public SaleController(SaleService saleService) {
        this.saleService = saleService;
    }

    @GetMapping
    public List<Sale> getAllSales() {
        return saleService.getAllSales();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Sale> getSaleById(@PathVariable Long id) {
        Optional<Sale> sale = saleService.getSaleById(id);
        return sale.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Sale> createSale(@RequestBody Sale sale) {
        Sale savedSale = saleService.saveSale(sale);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedSale);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Sale> updateSale(@PathVariable Long id, @RequestBody Sale sale) {
        if (!saleService.getSaleById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        sale.setId(id);
        Sale updatedSale = saleService.saveSale(sale);
        return ResponseEntity.ok(updatedSale);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteSale(@PathVariable Long id) {
        if (!saleService.getSaleById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        saleService.deleteSale(id);
        return ResponseEntity.noContent().build();
    }
}
