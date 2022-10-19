package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.Dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public  class CarServiceImpl implements CarService {

    @Autowired
    private  CarDao carDao;

    public  List<Car> showNCars (int n){
        return carDao.getCarList(n);
    }

}
