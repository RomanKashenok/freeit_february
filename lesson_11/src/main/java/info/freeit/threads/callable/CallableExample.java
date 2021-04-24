package info.freeit.threads.callable;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;

public class CallableExample {
    public final static List<Future<String>> workersResult = new ArrayList<>();
    public static boolean allLoaded = false;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        List<ServiceWorker> workers = new ArrayList<>();
        String[] services = new String[]{"instagram", "facebook", "vkontakte", "ok", "google-photo"};
        for (int i = 0; i < 5; i++) {
            workers.add(new ServiceWorker(services[i]));
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (Callable<String> worker : workers) {
            Future<String> futureResult = executor.submit(worker);
            workersResult.add(futureResult);
        }

        new Thread(() -> {
            int counterOfNotLoaded = workersResult.size();
            while (counterOfNotLoaded > 0) {
                for (Future<String> futureResult : workersResult) {
                    if (futureResult.isDone()) {
                        System.out.println(futureResult + " is done!");
                        counterOfNotLoaded--;
                    }
                }
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            allLoaded = true;
        }).start();

        while (!allLoaded) {
            System.out.println("wait please, data is loading...");
            Thread.sleep(1000);
        }

        for (Future<String> result : workersResult) {
            String res = result.get();
            System.out.println(res);
        }

            System.out.println("Program finished!");
    }
}

class ServiceWorker implements Callable<String> {
    private final String service;
    private Random rand = new Random();
    List<String> photosUrl = new ArrayList<>();

    ServiceWorker(String service) {
        this.service = service;
    }

    @Override
    public String call() throws Exception {
        for (int i = 0; i < rand.nextInt(21) + 10; i++) {
            String url = "https://www." + service + ".storage/" + rand.nextInt(20000000) + 10000000 + "/media?fields=media_type";
            photosUrl.add(url);
        }
        Thread.sleep(rand.nextInt(4000) + 1000);
        return photosUrl.toString();
    }
}