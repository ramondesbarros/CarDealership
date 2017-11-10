package br.com.cardealership.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cardealership.integration.CarRepository;
import br.com.cardealership.service.CarService;
import br.com.cardealership.system.domain.Car;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> listAllCars() {
        return (List<Car>) carRepository.findAll();
    }

    @Override
    public Car getCarById(Long id) {
        return carRepository.findOne(id);
    }

    @Override
    public String saveCar(Car car) {
        carRepository.save(car);
        return "Saved!";
    }

    @Override
    public void deleteCar(Long id) {
        carRepository.delete(id);
    }

}
