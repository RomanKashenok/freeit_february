package com.freeit.example1.remotes;

public class XiaomiTvRemote extends TvRemote implements Remote{

    protected XiaomiTvRemote(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Xiaomi Tv switching on");
    }

    @Override
    public void turnOff() {
        System.out.println("Xiaomi Tv switching on");
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
