package com.freeit.example1.remotes;

public class SamsungTvRemote extends TvRemote implements Remote{

    protected SamsungTvRemote(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Samsung Tv switching on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung Tv switching on");
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
}
