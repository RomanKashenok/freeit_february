package com.freeit.example1.remotes;

public abstract class TvRemote implements RemoteForTv {

    public final String brand;

    protected TvRemote(String brand) {
        this.brand = brand;
    }

    @Override
    public void turnOn() {
        System.out.println("Tv switching on");
    }

    @Override
    public void turnOff() {
        System.out.println("Tv switching off");
    }
}
