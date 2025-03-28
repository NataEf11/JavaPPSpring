package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> carList(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Mercedes-Benz", "E-Class", 2024));
            carList.add(new Car("Audi", "Q7", 2021));
            carList.add(new Car("Jaguar", "XE", 2019));
            carList.add(new Car("Aston Martin", "DB11", 2023));
            carList.add(new Car("Tesla", "Model S", 2022));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}