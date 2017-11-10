package br.com.cardealership.web;

import static br.com.cardealership.constants.CarDealershipConstants.CAR_ENDPOINT;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cardealership.service.CarService;
import br.com.cardealership.system.domain.Car;

@RestController
@RequestMapping(CAR_ENDPOINT)
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping(consumes = "application/json")
    public String saveDealership(Car car) {
        return carService.saveCar(car);
    }

    @GetMapping(value = "/{id}")
    public Car getCarById(Long id) {
        return carService.getCarById(id);
    }

    @GetMapping(produces = "application/json")
    @ResponseBody
    public List<Car> getAllCar() {
        return carService.listAllCars();
    }

    @PutMapping(consumes = "application/json")
    public void updateCar(Car car) {
        carService.saveCar(car);
    }

    @DeleteMapping(consumes = "application/json")
    public void deleteCar(Long id) {
        carService.deleteCar(id);
    }
}
