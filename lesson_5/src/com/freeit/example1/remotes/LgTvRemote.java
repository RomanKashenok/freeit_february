package com.freeit.example1.remotes;

public class LgTvRemote extends TvRemote implements RemoteForTv, BeerOpener{

    private String model;

    protected LgTvRemote(String brand, String model) {
        super(brand);
        this.model =model;
    }

    @Override
    public void turnOn() {
        System.out.println("LG Tv switching on");
    }

    @Override
    public void turnOff() {
        System.out.println("LG Tv switching on");
    }

    @Override
    public void increaseVolume() {
        System.out.println("Vol +");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Vol -");
    }

    @Override
    public void channelPlus() {
        System.out.println("Channel +");
    }

    @Override
    public void channelMinus() {
        System.out.println("Channel -");
    }

    @Override
    public void isSensor() {
        System.out.println("Yes, I'm touchable");
    }

    @Override
    public void openBeer() {
        System.out.println("Opens beer with back side");
    }
}
