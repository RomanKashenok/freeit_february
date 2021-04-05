package com.freeit.collect;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            sList.add("" + i);
        }
        System.out.println(sList);
        sList.remove(1);
        sList.remove("3");
        System.out.println(sList);
        System.out.println(sList.contains("2"));
        System.out.println(sList.contains("4"));

        List<String> sLList = new LinkedList<>();

        for (int i = 1; i <= 5; i++) {
            sLList.add("" + i);
        }
        System.out.println(sLList);
        sLList.remove(1);
        sLList.remove("3");
        System.out.println(sLList);



    }
}
