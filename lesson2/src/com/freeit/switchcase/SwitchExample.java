package com.freeit.switchcase;

import java.util.Random;

public class SwitchExample {
    public static void main(String[] args) {

        Random rand = new Random();
        int month = rand.nextInt(12) + 1;

        System.out.println(month);

        switch (month) {
            case 1:
            case 2:
            case 12:
                System.out.println("Winter time!!!");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring time!!!");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer time!");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn time!");
                break;
            default:
                System.out.println("Нет такого месяца");
        }
    }
}
