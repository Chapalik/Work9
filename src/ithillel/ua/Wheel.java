package ithillel.ua;

public class Wheel {
    private String model;
    private int radius;

    public Wheel(String model, int radius) {
        this.model = model;
        this.radius = radius;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
