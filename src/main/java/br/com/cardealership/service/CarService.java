package br.com.cardealership.service;

import java.util.List;

import br.com.cardealership.system.domain.Car;

public interface CarService {

    List<Car> listAllCars();

    Car getCarById(Long id);

    String saveCar(Car car);

    void deleteCar(Long id);
}
