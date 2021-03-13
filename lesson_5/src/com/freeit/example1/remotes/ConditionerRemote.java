package com.freeit.example1.remotes;

public abstract class ConditionerRemote implements Remote {

    @Override
    public void turnOn() {
        System.out.println("Conditioner switching on");
    }

    @Override
    public void turnOff() {
        System.out.println("Conditioner switching off");
    }

    public abstract void increaseTemp();
    public abstract void decreaseTemp();
}
