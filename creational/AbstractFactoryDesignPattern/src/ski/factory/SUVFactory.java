package ski.factory;

import ski.computers.Car;
import ski.computers.SUV;

public class SUVFactory implements AbstarctCarFactory {
    private String engine;
    private int capacity;
    private String name;

    public SUVFactory(String engine, int capacity, String name) {
        this.engine = engine;
        this.capacity = capacity;
        this.name = name;
    }

    @Override
    public Car createCar() {
        return new SUV(this.engine, this.capacity, this.name);
    }
}
