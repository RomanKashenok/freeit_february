package com.freeit.example1;

public class StelsAirplane extends Airplane{

    private boolean isMilitary;
    private boolean isArmed;

    public StelsAirplane(double maxDistance, String color, boolean isMilitary, boolean isArmed) {
        super(maxDistance, color);
        this.isMilitary = isMilitary;
        this.isArmed = isArmed;
    }

    public boolean isMilitary() {
        return isMilitary;
    }

    public void setMilitary(boolean military) {
        isMilitary = military;
    }

    public boolean isArmed() {
        return isArmed;
    }

    public void setArmed(boolean armed) {
        isArmed = armed;
    }

    @Override
    public void takeOff() {
        System.out.println("Stels taking off vertically");
    }

    @Override
    public void land() {
        System.out.println("Stels landing vertically");
    }

    public void fire() {
        System.out.println("bang-bang-bang");
    }

    @Override
    public String toString() {
        return super.toString() + "StelsAirplane{" +
                "isMilitary=" + isMilitary +
                ", isArmed=" + isArmed +
                '}';
    }
}
