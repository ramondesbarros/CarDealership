package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardealership.integration.ManagerRepository;
import br.com.cardealership.service.ManagerService;
import br.com.cardealership.system.domain.Manager;

@Service
public class ManagerServiceImpl implements ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Override
    public List<Manager> listAllManager() {
        return managerRepository.findAll();
    }

    @Override
    public Manager getManagerById(Long id) {
        return managerRepository.findOne(id);
    }

    @Override
    public String saveManager(Manager manager) {
        managerRepository.save(manager);
        return "Saved!";
    }

    @Override
    public void deleteManager(Long id) {
        managerRepository.delete(id);
    }
}
