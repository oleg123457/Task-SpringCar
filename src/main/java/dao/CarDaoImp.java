package dao;

import Model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImp implements CarDao{
    @Override
    public List<Car> getCar(int count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Porsche", 01, "4"));
        cars.add(new Car("Mercedes", 02, "221"));
        cars.add(new Car("Bmw", 03, "M5"));
        cars.add(new Car("Toyota", 04, "70"));
        cars.add(new Car("Lexus", 05, "570"));

        return cars;
    }
}
