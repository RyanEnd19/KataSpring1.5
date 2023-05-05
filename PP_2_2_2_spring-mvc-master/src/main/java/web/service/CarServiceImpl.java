package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CarServiceImpl {
    private List<Car> carList;

    public CarServiceImpl() {
        carList = new ArrayList<>(Arrays.asList(
                new Car("Ford", "Mustang", 1967),
                new Car("Chevrolet", "Camaro", 1969),
                new Car("Dodge", "Charger", 1969),
                new Car("Toyota", "Supra", 1994),
                new Car("Nissan", "Skyline GT-R", 1999)
        ));
    }

    public List<Car> getCars(Integer count) {
        if (count == null || count >= carList.size()) {
            return carList;
        } else {
            return carList.subList(0, count);
        }
    }
}
