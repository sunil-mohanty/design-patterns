package ski.factory;

import ski.computers.Car;

public class ProductionFactory {
    public Car getCar(AbstarctCarFactory factory) {
        return factory.createCar();
    }
}
