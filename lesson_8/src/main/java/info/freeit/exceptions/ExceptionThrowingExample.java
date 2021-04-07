package info.freeit.exceptions;

import java.util.Scanner;

public class ExceptionThrowingExample {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IllegalArgumentException {

        System.out.println("Enter your age please: \n");
        int age = sc.nextInt();

        checkAgeMethod(age);

        System.out.println("Завершение программы!");
    }

    private static void checkAgeMethod(int age) throws IllegalArgumentException {
        if(age < 100) {
            System.out.println("Привет реальый человек!");
        } else {
            throw new IllegalArgumentException(String.format("Вы ввели нереальный для Беларуси возраст!!! А именно %d", age));
        }
    }


}
