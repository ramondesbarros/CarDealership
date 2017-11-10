package br.com.cardealership.web;

import static br.com.cardealership.constants.CarDealershipConstants.DEALERSHIP_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardealership.service.DealershipService;
import br.com.cardealership.system.domain.Dealership;

@RestController
@RequestMapping(DEALERSHIP_ENDPOINT)
public class DealershipController {

    @Autowired
    private DealershipService dealershipService;

    @PostMapping(consumes = "application/json")
    public String saveDealership(Dealership dealership) {
        return dealershipService.saveDealership(dealership);
    }

    @GetMapping(value = "/{id}")
    public Dealership getDealershipById(Long id) {
        return dealershipService.getDealershipById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Dealership> getAllDealership() {
        return dealershipService.listAllDealership();
    }

    @PutMapping(consumes = "application/json")
    public void updateDealership(Dealership dealership) {
        dealershipService.saveDealership(dealership);
    }

    @DeleteMapping(consumes = "application/json")
    public void deleteDealership(Long id) {
        dealershipService.deleteDealership(id);
    }
}
