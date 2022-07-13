package ithillel.ua;

public class CarTest {
    public static void main(String[] args) {

        Car car = new Car("Camry", 2022, "Toyota");
        car.setEngine(new Engine("QWE2356", 260, 2.68F));
        car.setWheel(new Wheel[]{
                new Wheel("Nokian", 20),
                new Wheel("Nokian", 20),
                new Wheel("Nokian", 20),
                new Wheel("Nokian", 20)
        });
        car.setTransmission(new Transmission("Automate",6));

        System.out.println(car);

    }
}
