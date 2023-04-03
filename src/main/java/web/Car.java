package web;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    private static final List<Car> carList;

    static {
        carList = new ArrayList<>();
        carList.add(new Car("BMW", "EK202X", 50));
        carList.add(new Car("Audi", "EM500X", 20));
        carList.add(new Car("Honda", "TY779P", 17));
        carList.add(new Car("Volga", "KK808L", 40));
        carList.add(new Car("Lada", "BB114K", 11));
    }


    private String model;
    private String number;
    private int price;

    public Car(String model, String number, int price) {
        this.model = model;
        this.number = number;
        this.price = price;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static List<Car> getCarList() {
        return carList;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (price != car.price) return false;
        if (!Objects.equals(model, car.model)) return false;
        return Objects.equals(number, car.number);
    }

    @Override
    public int hashCode() {
        int result = model != null ? model.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        result = 31 * result + price;
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", number='" + number + '\'' +
                ", price=" + price +
                '}';
    }

}

