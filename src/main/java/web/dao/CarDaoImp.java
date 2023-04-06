package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImp implements CarDao {

    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "EK202X", 50));
        carList.add(new Car("Audi", "EM500X", 20));
        carList.add(new Car("Honda", "TY779P", 17));
        carList.add(new Car("Volga", "KK808L", 40));
        carList.add(new Car("Lada", "BB114K", 11));
    }

    @Override
    public List<Car> showCarCant(Integer count) {
        if (count == null || count < 0) return carList;
        return carList.stream().limit(count).collect(Collectors.toList());
    }

}
