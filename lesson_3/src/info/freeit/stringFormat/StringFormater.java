package info.freeit.stringFormat;

import java.awt.*;
import java.util.Scanner;

public class StringFormater {

    int a = 10;

	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ВВедите ваше имя!!!");
        String name = sc.nextLine();

        System.out.println("Сколькикратное ура?");
        int hoorayCount = sc.nextInt();

        String result = String.format("Hello, %s! Ура %d раз!", name, hoorayCount);

        System.out.println(result);

        double a = 5.634675734;

        System.out.println(String.format("Число: %.4f", a));


	}
}
