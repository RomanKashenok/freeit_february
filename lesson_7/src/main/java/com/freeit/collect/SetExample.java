package com.freeit.collect;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {

        Set<String> sSet = new HashSet<>();

        sSet.add("Roma");
        sSet.add("Petya");
        sSet.add("Vasya");
        sSet.add(null);

        System.out.println(sSet);



    }
}
