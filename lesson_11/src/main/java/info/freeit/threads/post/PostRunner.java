package info.freeit.threads.post;

import java.util.Random;

public class PostRunner {
    public static void main(String[] args) {

        Random rand = new Random();

        String [] names = {"Вася", "Петя", "Таня", "Коля", "Надя", "Галя", "Саша", "Рома", "Женя"};
        String [] mask = {"Веселый", "Грустный", "Соленый", "Странный", "Большой", "Крепкий", "Прозрачный", "Рыжий", "Воздушный"};

        PostOffice post = new PostOffice();

        for (int i = 0; i < 10; i++) {
            String clientName = mask[rand.nextInt(mask.length-1)]
                    + " " + names[rand.nextInt(names.length-1)];
            post.cashier.doSomething(new PosClient(), clientName);
        }

    }
}
