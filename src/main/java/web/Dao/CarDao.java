package web.Dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDao {
    public List<Car> carList = new ArrayList<>();
    {
        carList.add(new Car("Vaz",2100, "Red"));
        carList.add(new Car("Porsche",911, "Silver"));
        carList.add(new Car("Mitsubishi",11, "Green"));
        carList.add(new Car("Toyota",2, "White"));
        carList.add(new Car("Gaz",21, "Black"));
    }
    public List<Car> getCarList(Integer n){
        return n == null ? carList : carList.stream().limit(n).toList();
    }

}
