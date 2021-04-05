package com.freeit.collect;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class NonModifThreadSafeCollections {

    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            sList.add("" + i);
        }
        System.out.println(sList);

//        List<String> unmList = Collections.unmodifiableList(sList);
//
//        for (int i = 0; i < unmList.size(); i++) {
//            if(unmList.get(i).equals("5")) {
//                unmList.remove(i);
//            }
//        }

//        Iterator<String> iterator = sList.iterator();
//
//        while (iterator.hasNext()) {
//            String num = iterator.next();
//            System.out.print(num + " ");
//            if(num.equals("5")) {
//                iterator.remove();
//            }
//        }
//
//        System.out.println(sList);

        List<String> strings = Collections.synchronizedList(sList);


    }

}
