package ski.factory;

public class CarProducer {
    public static void main(String args[]) {
        ProductionFactory factory = new ProductionFactory();

        System.out.println(factory.getCar(new SedanFactory("t3.3 L Lambda V6 GDI", 5, "Hyundai Genesis")));

        System.out.println(factory.getCar(new SUVFactory("3.0 L N52/N55 I6", 7, "BMW X5")));

    }
}
