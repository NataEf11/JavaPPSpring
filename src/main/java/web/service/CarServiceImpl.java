package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private static final List<Car> cars = new ArrayList<>();

    static {
        cars.add(new Car("Mercedes-Benz", "E-Class", 2024));
        cars.add(new Car("Audi", "Q7", 2021));
        cars.add(new Car("Jaguar", "XE", 2019));
        cars.add(new Car("Aston Martin", "DB11", 2023));
        cars.add(new Car("Tesla", "Model S", 2022));
    }

    @Override
    public List<Car> carList(int count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> carList(Integer count) {
        return List.of();
    }


}

