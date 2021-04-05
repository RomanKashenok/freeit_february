package com.freeit.generics;

import java.util.Arrays;

public class BoxRunner {
    public static void main(String[] args) {

        Box<Double> giftBox = new Box<>(4.0, 12.1, 8.2, 3.0, 5.5);

        giftBox.printAllArgs(Arrays.asList(giftBox.getObjs()));
    }
}
