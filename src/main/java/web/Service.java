package web;

import java.util.ArrayList;
import java.util.List;

public class Service {
    static public List<Car> getCountCars(int count){
        List<Car> var = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            var.add(Car.getCarList().get(i));
        }
        return var;
    }


}
