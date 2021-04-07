package info.freeit.exceptions;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Runner2 {
    static String username;
    static String password;

    static Scanner sc = new Scanner(System.in);
    static Random rand = new Random();

    static List<String> sList = new ArrayList<>();
    static int k = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Program started");
        int[] arr = new int[10];
//
//        for (int i = 0; i <= arr.length; i++) {
//            arr[i] = rand.nextInt(100);
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println("Вот " + i + "'й элемент массива: " + arr[i]);
//        }
//
//        System.out.println("Program finished");

//        try {
//            username = args[0];
//            password = args[1];
//        } catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("Exception cached: " + ex.getLocalizedMessage());
//            Thread.sleep(1000);
//            forceToEnterUsernameAndPassword();
//        } finally {
//            System.out.println("***********From finally block!");
//        }
//        System.out.println(username);
//        System.out.println(password);

//        try {
//            callInRecursion(username);
//        } catch (Error err) {
//            System.out.println("Что-то пошло не так!");
//        }

//        forceToEnterUsernameAndPassword();

        while (true) {
            sList.add("test " + k);
            k++;
        }

//        System.out.println("Завершение программы!");
    }

    private static void callInRecursion(String username) {
        callInRecursion(username);
    }

    private static void forceToEnterUsernameAndPassword() {
        boolean dataFilled = false;
        while (!dataFilled) {
            System.out.println("Enter username");
            int a = sc.nextInt();
            System.out.println("Enter password");
            password = sc.nextLine();

            if (username != null && username.toCharArray().length > 0
                    && password != null && password.toCharArray().length > 0) {
                dataFilled = true;
            }
        }
    }
}
