package web.service;

import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

public  class CarService {
    private static final CarDao carDao = new CarDao();

    public static List<Car> showNCars (Integer n){
        return carDao.getCarList(n);
    }

}
