package info.freeit.threads.synchroniation.modern;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class ToiletExample {

    private final static Semaphore toiletGuardian = new Semaphore(5);
    private final static Random rand = new Random();

    public static void main(String[] args) {

        for (int i = 0; i < 17; i++) {
            new Thread(() -> {
                try {

                    System.out.println("Thread : " + Thread.currentThread().getName() + " подошел к toiletGuardian");
                    toiletGuardian.acquire();
                    System.out.println("Enter granted for: " + Thread.currentThread().getName());
                    Thread.sleep(rand.nextInt(4000) + 1000);
                    System.out.println("Thread " + Thread.currentThread().getName() + " finished");
                    toiletGuardian.release();

                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
            }, "chuvak " + i).start();
        }

    }
}
