package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.Sale;

public interface SaleService {

    List<Sale> listAllSale();

    Sale getSaleById(Long id);

    String saveSale(Sale sale);

    void deleteSale(String id);
}
