package com.freeit.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Runner {
    public static void main(String[] args) {
        Random rand = new Random();
        List<Human> clazz = new ArrayList<>();
//        Human starosta = new Human("Pavlik", 21, 178);
//        clazz.add(starosta);
        for (int i = 0; i < 10; i++) {
            clazz.add(new Human("Human", rand.nextInt(15) + 15, rand.nextInt(30) + 160));
        }

        System.out.println(clazz);

//        Collections.sort(clazz, (h1, h2) -> h2.getHeigth() - h1.getHeigth());
//        Collections.sort(clazz);
//        Collections.sort(clazz, starosta);
        Collections.sort(clazz, clazz.get(rand.nextInt(10)));

        System.out.println(clazz);
    }
}
