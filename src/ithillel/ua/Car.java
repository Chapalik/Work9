package ithillel.ua;


public class Car {

    private Engine engine;
    private Wheel[] wheel;
    private Transmission transmission;

    private String model;
    private int year;
    private String label;

    public Car(Engine engine, Wheel[] wheel, Transmission transmission, String model, int year, String label) {
        this.engine = engine;
        this.wheel = wheel;
        this.transmission = transmission;
        this.model = model;
        this.year = year;
        this.label = label;
    }

    public Car(String model, int year, String label) {
        this.model = model;
        this.year = year;
        this.label = label;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }


    public void setWheel(Wheel[] wheel) {
        this.wheel = wheel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

