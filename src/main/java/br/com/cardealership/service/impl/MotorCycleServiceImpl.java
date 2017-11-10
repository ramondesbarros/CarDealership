package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.cardealership.integration.MotorCycleRepository;
import br.com.cardealership.service.MotorCycleService;
import br.com.cardealership.system.domain.MotorCycle;

public class MotorCycleServiceImpl implements MotorCycleService {

    @Autowired
    private MotorCycleRepository motorCycleRepository;

    @Override
    public List<MotorCycle> listAllMotorCycle() {
        return motorCycleRepository.findAll();
    }

    @Override
    public MotorCycle getMotorCycleById(Long id) {
        return motorCycleRepository.findOne(id);
    }

    @Override
    public String saveMotorCycle(MotorCycle motorCycle) {
        motorCycleRepository.save(motorCycle);
        return "Saved!";
    }

    @Override
    public void deleteMotorCycle(Long id) {
        motorCycleRepository.delete(id);
    }
}
