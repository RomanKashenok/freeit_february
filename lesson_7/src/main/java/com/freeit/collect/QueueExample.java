package com.freeit.collect;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {

        Queue<String> sQueue = new PriorityQueue<>(5);

        sQueue.add("1");
        sQueue.add("2");
        sQueue.add("3");
        sQueue.add("4");
        sQueue.add("5");
        sQueue.add("6");
        sQueue.add("7");
        sQueue.add("8");
        System.out.println(sQueue);

        sQueue.poll();
        System.out.println(sQueue);
        sQueue.peek();
        System.out.println(sQueue);
        boolean added = sQueue.offer("9");
        System.out.println(added);
        System.out.println(sQueue);
    }
}
