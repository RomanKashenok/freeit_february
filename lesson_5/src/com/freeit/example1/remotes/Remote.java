package com.freeit.example1.remotes;

public interface Remote {
    void turnOn();
    void turnOff();

    default void isSensor() {
        System.out.println("Not sensor");
    }
}
