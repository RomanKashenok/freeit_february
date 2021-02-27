package com.freeit.arrays;

import java.util.Random;

public class ArraysExample {

    static Random rand = new Random();

    public static void main(String[] args) {

        int a = 10;

        int [] arr = {1,2,3};
        int [] arr2 = new int[5];

        String [] names = {"Roma", "Jane", "Vasya"};
        String [] names2 = new String[5]; // null

        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = rand.nextInt(100);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        };
     }
}
