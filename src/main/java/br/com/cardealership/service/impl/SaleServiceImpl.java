package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardealership.integration.SaleRepository;
import br.com.cardealership.service.SaleService;
import br.com.cardealership.system.domain.Sale;

@Service
public class SaleServiceImpl implements SaleService {

    @Autowired
    private SaleRepository saleRepository;

    @Override
    public List<Sale> listAllSale() {
        return saleRepository.findAll();
    }

    @Override
    public Sale getSaleById(Long id) {
        return saleRepository.findOne("");
    }

    @Override
    public String saveSale(Sale sale) {
        saleRepository.save(sale);
        return null;
    }

    @Override
    public void deleteSale(String id) {
        saleRepository.delete(id);
    }

}
