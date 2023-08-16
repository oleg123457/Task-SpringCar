package Service;

import Model.Car;
import dao.CarDao;
import dao.CarDaoImp;

import java.util.List;

public class CarServiceImp implements CarService{
    private final CarDao carDao = new CarDaoImp();

    @Override
    public List<Car> getCar(int count) {
        return carDao.getCar(count);
    }
}
