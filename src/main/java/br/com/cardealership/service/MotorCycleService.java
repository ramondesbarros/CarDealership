package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.MotorCycle;

public interface MotorCycleService {

    List<MotorCycle> listAllMotorCycle();

    MotorCycle getMotorCycleById(Long id);

    String saveMotorCycle(MotorCycle motorCycle);

    void deleteMotorCycle(Long id);

}
