package ski.factory;

import ski.computers.Car;
import ski.computers.Sedan;

public class SedanFactory implements  AbstarctCarFactory{
    private String engine;
    private int capacity;
    private String name;

    public SedanFactory(String engine, int capacity, String name) {
        this.engine = engine;
        this.capacity = capacity;
        this.name = name;
    }


    @Override
    public Car createCar() {
        return new Sedan(this.engine, this.capacity, this.name);
    }
}
