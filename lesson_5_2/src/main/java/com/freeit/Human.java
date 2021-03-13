package com.freeit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Human implements Cloneable {
    private String name;
    private int age;
    private Car car;

    public Human(Human forClonning) {
        this(forClonning.getName(),
                forClonning.getAge(),
                new Car(forClonning.getCar().getColor(), forClonning.getCar().getBrand(), forClonning.getCar().getModel()));
    }

    @Override
    protected Human clone() throws CloneNotSupportedException {
        Human clone = (Human) super.clone();
        clone.setCar(new Car(this.car.getColor(), this.car.getBrand(), this.car.getModel()));
        return clone;
    }
}
