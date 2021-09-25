package web.service;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImp implements CarService{

    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Model1", "series1", 33450));
        cars.add(new Car("Model2", "series2", 123056));
        cars.add(new Car("Model3", "series3", 175794));
        cars.add(new Car("Model4", "series4", 7658));
        cars.add(new Car("Model5", "series5", 89254));
    }

    @Override
    public List<Car> getCarByCount(Integer count) {
        return (count == null) ? cars : cars.stream().limit(count).collect(Collectors.toList());

    }

}
