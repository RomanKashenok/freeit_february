package com.freeit.compare;

import java.util.Comparator;

public class Fizruk implements Comparator<Human> {

    @Override
    public int compare(Human h1, Human h2) {
        return h2.getHeigth() - h1.getHeigth();
    }
}
