package com.freeit.example1;

public class PassengerAirplane extends Airplane {
    private int passengersCapacity;
    private boolean isPropeller;
    private String modelName;

    public PassengerAirplane(double maxDistance, String modelName,
                             String color, int passengersCapacity,
                             boolean isPropeller) {
        super(maxDistance, color);
        this.passengersCapacity = passengersCapacity;
        this.isPropeller = isPropeller;
        this.modelName = modelName;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public boolean isPropeller() {
        return isPropeller;
    }

    public void setPropeller(boolean propeller) {
        isPropeller = propeller;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public void takeOff() {
        System.out.println("Airplane taking off from runway");
    }

    @Override
    public void land() {
        System.out.println("Airplane landing to runway");
    }

    @Override
    public String toString() {
        return super.toString() + "PassengerAirplane{" +
                "passengersCapacity=" + passengersCapacity +
                ", isPropeller=" + isPropeller +
                ", modelName=" + modelName +
                '}';
    }
}
