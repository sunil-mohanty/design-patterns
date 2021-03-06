package ski.computers;

public class SUV extends Car {
    private String engine;
    private int capacity;
    private String name;

    public SUV(String engine, int capacity, String name) {
        this.engine = engine;
        this.capacity = capacity;
        this.name = name;
    }


    @Override
    public String getEngine() {
        return this.engine;
    }

    @Override
    public int getCapaity() {
        return this.capacity;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
