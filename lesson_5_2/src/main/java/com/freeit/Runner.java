package com.freeit;

public class Runner {
    public static void main(String[] args) throws CloneNotSupportedException {
        Car car = new Car("Black", "MAZDA", "CX-7");
        Human human = new Human("Vasya", 35, car);

//        Human clone = (Human)human.clone();

        Human clone = new Human(human);

        clone.setName("Clone");
        clone.getCar().setColor("Pink");
        clone.getCar().setBrand("Mini");
        clone.getCar().setModel("Cooper");
//
        System.out.println(human);
        System.out.println(clone);
    }
}
