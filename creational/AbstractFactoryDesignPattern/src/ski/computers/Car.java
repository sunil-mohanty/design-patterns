package ski.computers;

public abstract class Car {

    public abstract String getEngine();
    public abstract int getCapaity();
    public abstract String getName();

    public String toString() {
        return "Name : " + getName() + ", Engine type : " + getEngine() + "  Capacity : " + getCapaity() + "Seater";
    }
}
