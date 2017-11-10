package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardealership.integration.DealershipRepository;
import br.com.cardealership.service.DealershipService;
import br.com.cardealership.system.domain.Dealership;

@Service
public class DealershipServiceImpl implements DealershipService {

    @Autowired
    private DealershipRepository dealershipRepository;

    @Override
    public List<Dealership> listAllDealership() {
        return dealershipRepository.findAll();
    }

    @Override
    public Dealership getDealershipById(Long id) {
        return dealershipRepository.findOne(id);
    }

    @Override
    public String saveDealership(Dealership dealership) {
        dealershipRepository.save(dealership);
        return "message";
    }

    @Override
    public void deleteDealership(Long id) {
        dealershipRepository.delete(id);
    }

}
