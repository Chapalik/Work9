package ithillel.ua;

public class CarTest {
    private String Engine = "Engine";
    private String Transmission = "Transmission";
    private String[] Wheel = {"wheel1", "wheel2", "wheel3", "wheel4", "spareWheel"};

    public String getEngine() {
        return Engine;
    }

    public void setEngine(String engine) {
        Engine = engine;
    }

    public String getTransmission() {
        return Transmission;
    }

    public void setTransmission(String transmission) {
        Transmission = transmission;
    }

    public String[] getWheel() {
        return Wheel;
    }

    public void setWheel(String[] wheel) {
        Wheel = wheel;
    }
}
