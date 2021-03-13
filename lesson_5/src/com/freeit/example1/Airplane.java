package com.freeit.example1;

public abstract class Airplane {
    private double maxDistance;
    private String color;

    public Airplane(double maxDistance, String color) {
        this.maxDistance = maxDistance;
        this.color = color;
    }

    public double getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(double maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void takeOff();

    public abstract void land();

    public void signal() {
        System.out.println("Blink");
    }

    public void fire() {
        throw new UnsupportedOperationException();
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "maxDistance=" + maxDistance +
                ", color='" + color + '\'' +
                '}';
    }
}
