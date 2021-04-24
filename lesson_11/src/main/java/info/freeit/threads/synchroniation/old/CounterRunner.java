package info.freeit.threads.synchroniation.old;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

public class CounterRunner {

    public static ReentrantLock lock = new ReentrantLock();
    public static AtomicInteger counter = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
//        for (int i = 0; i < 100; i++) {
//            new Thread(() -> {
//                for (int j = 0; j < 1000; j++) {
//                    counter.addAndGet(1);
//                }
//            }).start();
//        }
//        Thread.sleep(100);
//        System.out.println(counter);

        Counter counter = new Counter();

        for (int i = 0; i < 5; i++) {
            new Thread(() -> {
                lock.lock();
                    counter.count = 1;
                    for (int j = 0; j < 5; j++) {
                        System.out.printf("Thread %s modified counter. Current count = %d, ineration: %d \n", Thread.currentThread().getName(), counter.count, j);
                        counter.increment();
                    }
                    letOtherThreadsIn();
            }).start();
        }
    }

    private static void letOtherThreadsIn() {
        System.out.println(Thread.currentThread().getName() + " finished with incrementing");
        lock.unlock();
    }
}
