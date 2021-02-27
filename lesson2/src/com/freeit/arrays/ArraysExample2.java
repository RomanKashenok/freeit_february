package com.freeit.arrays;

import java.util.Random;

public class ArraysExample2 {

    static Random rand = new Random();

    public static void main(String[] args) {

//        String [][] students = new String [3][];
//
//        students[0] = new String[3];
//        students[0][0]= "Fil";
//        students[0][1]= "Math";
//        students[0][2]= "Lit";
//
//        students[1] = new String[4];
//        students[1][0]= "Phys";
//        students[1][1]= "Trud";
//        students[1][2]= "Math";
//        students[1][3]= "Geom";
//
//        students[2] = new String[2];
//        students[2][0]= "Swim"; // vasya[0], vasya[1], vasya[2]
//        students[2][1]= "Sing";
//
//        for (int i = 0; i < students.length; i++) {
//            for (int j = 0; j < students[i].length; j++) {
//                System.out.print(students[i][j] + " ");
//            }
//            System.out.println();
//        }


        char [][]  arr = new char[7][7];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(i >= j) {
                    arr[i][j] = '*';
                }
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

     }
}
