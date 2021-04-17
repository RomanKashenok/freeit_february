package info.freeit.threads.waitNotify;

import java.util.Random;

public class WaitNotifyExample {

    public static Object mutex = new Object();

    public static int result = 0;

    public static void main(String[] args) throws InterruptedException {
        Thread printer = new Printer();
        printer.start();

        synchronized (mutex) {
            mutex.wait();
        }
        System.out.println(result + " pages printed!");
    }

    static class Printer extends Thread {
        Random rand = new Random();
        @Override
        public void run() {
            synchronized (mutex) {
                for (int i = 0; i < rand.nextInt(20); i++) {
                    result ++;
                }
                mutex.notify();
            }
        }
    }
}
