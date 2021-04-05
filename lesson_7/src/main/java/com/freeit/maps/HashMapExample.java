package com.freeit.maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {

        Map<String, Integer> nameAgeMap = new HashMap<>();

        String name1 = "Test";
        String name2 = null;
        String name3 = null;

        nameAgeMap.put("Roma", null);
        nameAgeMap.put("Vasya", null);
        nameAgeMap.put("Petya", null);
        nameAgeMap.put(name1, null);
        nameAgeMap.put(name2, null);
        System.out.println(nameAgeMap);
        nameAgeMap.put(name3, null);

        System.out.println(nameAgeMap);

        Integer romasAge = nameAgeMap.get("Roma");
        System.out.println(romasAge);
    }
}
