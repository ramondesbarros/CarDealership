package br.com.cardealership.web;

import static br.com.cardealership.constants.CarDealershipConstants.MOTOR_CYCLE_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardealership.service.MotorCycleService;
import br.com.cardealership.system.domain.MotorCycle;

@RestController
@RequestMapping(MOTOR_CYCLE_ENDPOINT)
public class MotorCycleController {

    @Autowired
    private MotorCycleService motorCycleService;

    @PostMapping(consumes = "application/json")
    public String saveManager(MotorCycle motorCycle) {
        return motorCycleService.saveMotorCycle(motorCycle);
    }

    @GetMapping(value = "/{id}")
    public MotorCycle getMotorCycleById(Long id) {
        return motorCycleService.getMotorCycleById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<MotorCycle> getAllMotorCycle() {
        return motorCycleService.listAllMotorCycle();
    }

    @PutMapping(consumes = "application/json")
    public void updateMotorCycle(MotorCycle motorCycle) {
        motorCycleService.saveMotorCycle(motorCycle);
    }

    @DeleteMapping(consumes = "application/json")
    public void deleteMotorCycle(Long id) {
        motorCycleService.deleteMotorCycle(id);
    }

}
