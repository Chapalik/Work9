package ithillel.ua;

public class TestForCar {
    public static void main(String[] args) {
        CarTest carTestAttribute = new CarTest();
        Car randomCar = new Car();
        randomCar.setCarColor("black");
        randomCar.setCarEngine(carTestAttribute.getEngine());
        randomCar.setCarTransmission(carTestAttribute.getTransmission());
        randomCar.setCarType("randomCarType");
        randomCar.setCarWheel(carTestAttribute.getWheel());

        System.out.println(randomCar);


    }
}
