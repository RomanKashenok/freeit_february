package com.freeit.generics;

import lombok.Data;

import java.util.Arrays;
import java.util.List;

@Data
public class Box<T extends Number> {

    private T[] objs;

    public Box(T... objs) {
        this.objs = objs;
    }

    public double sumAllArgs() {
        return Arrays.asList(objs).stream()
                .mapToDouble(it -> it.doubleValue())
                .sum();
    }

    public void printAllArgs(List<? super Integer> list) {
        list.forEach(System.out::println);
    }
}
