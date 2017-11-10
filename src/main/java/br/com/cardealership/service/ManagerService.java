package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.Manager;

public interface ManagerService {

    List<Manager> listAllManager();

    Manager getManagerById(Long id);

    String saveManager(Manager manager);

    void deleteManager(Long id);

}
