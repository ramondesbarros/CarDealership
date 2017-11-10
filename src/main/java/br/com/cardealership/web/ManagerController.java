package br.com.cardealership.web;

import static br.com.cardealership.constants.CarDealershipConstants.MANAGER_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardealership.service.ManagerService;
import br.com.cardealership.system.domain.Manager;

@RestController
@RequestMapping(MANAGER_ENDPOINT)
public class ManagerController {

    @Autowired
    private ManagerService managerService;

    @PostMapping(consumes = "application/json")
    public String saveManager(Manager manager) {
        return managerService.saveManager(manager);
    }

    @GetMapping(value = "/{id}")
    public Manager getManagerById(Long id) {
        return managerService.getManagerById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Manager> getAllManager() {
        return managerService.listAllManager();
    }

    @PutMapping(consumes = "application/json")
    public void updateManager(Manager manager) {
        managerService.saveManager(manager);
    }

    @DeleteMapping(consumes = "application/json")
    public void deleteManager(Long id) {
        managerService.deleteManager(id);
    }

}
