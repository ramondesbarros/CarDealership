package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.Dealership;

public interface DealershipService {

    List<Dealership> listAllDealership();

    Dealership getDealershipById(Long id);

    String saveDealership(Dealership dealership);

    void deleteDealership(Long id);

}
