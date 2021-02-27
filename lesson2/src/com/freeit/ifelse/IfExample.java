package com.freeit.ifelse;

import java.util.Random;

public class IfExample {

    static Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {

        //if - оператор ветвления

        // 1 - вам есть 18
        // 2 - вы парень            - Здаров Мужик / Доброго дня, мэм
        // 3 - у вас есть борода    - Пивка дерябнем? / вот вам шампусик

        int age = 18;

        if(isAdult(age)) {
            System.out.println("Вам же есть 18? ");
            System.out.println(isAdult(age));
        }

        if(isAdult(age)) {
            if(isMale()) {
                System.out.println("Здаров дядька!");
                if (isBeardPresent()) {
                    System.out.println("Пивка?");
                } else {
                    System.out.println("Чего хотите, музчина?");
                }
            } else {
                System.out.println("Доброго дня, мэм");
            }
        } else {
            System.out.println("Ниче не понимаю");
        }

    }

    public static boolean isAdult(int age) throws InterruptedException {
        Thread.sleep(3000);
        return age >= 18;
    }
    public static boolean isMale() throws InterruptedException {
        Thread.sleep(4000);
        return rand.nextBoolean();
    }
    public static boolean isBeardPresent() throws InterruptedException {
        Thread.sleep(4000);
        return rand.nextBoolean();
    }
}
