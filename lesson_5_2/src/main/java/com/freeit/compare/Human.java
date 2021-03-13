package com.freeit.compare;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

import java.util.Comparator;

@Data
@AllArgsConstructor
public class Human implements Comparable<Human>, Comparator<Human> {

    @ToString.Exclude
    private String name;
    @ToString.Exclude
    private int age;
    private int heigth;

    @Override
    public int compareTo(Human human) {
        return human.getHeigth() - this.getHeigth();
    }

    @Override
    public int compare(Human h1, Human h2) {
        return h2.getHeigth() - h1.getHeigth();
    }
}

