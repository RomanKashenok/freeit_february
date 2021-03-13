package com.freeit.example1;

public class Runner {
    public static void main(String[] args) {
        Airplane a1 = new PassengerAirplane(1000, "ambraer", "gray", 150, false);
        System.out.println(a1);
        a1.takeOff();
        a1.land();

        Airplane a2 = new StelsAirplane(1000, "ambraer", true, true);
        System.out.println(a2);
        a2.takeOff();
        a2.land();

        a1.signal();
        a2.signal();
        a2.fire();
    }
}
