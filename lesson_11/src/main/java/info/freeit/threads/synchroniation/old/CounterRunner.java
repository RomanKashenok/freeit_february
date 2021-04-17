package info.freeit.threads.synchroniation.old;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.locks.ReentrantLock;

public class CounterRunner {

    public static ReentrantLock lock = new ReentrantLock();
    public static CyclicBarrier barrier = new CyclicBarrier(5);
    public static boolean condition = false;

    public static void main(String[] args) {

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                try {
                    barrier.await();
                    if(!condition) {
                        condition = true;
                        Thread.sleep(15);
                    }
                    counter.count = 1;
                    synchronized (counter) {
                        for (int j = 0; j < 5; j++) {
                            System.out.printf("Thread %s modified counter. Current count = %d, ineration: %d \n", Thread.currentThread().getName(), counter.count, j);
                            counter.increment();
                        }
                    }
                } catch (Exception e) {
                }
            }).start();
        }

    }
}
