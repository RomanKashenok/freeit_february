package info.freeit.threads.synchroniation.old;

import java.util.concurrent.locks.ReentrantLock;

public class Counter {

    public int count = 0;

    public void increment() {
//        synchronized (Counter.class) {
            int currentCount = count;
            currentCount = currentCount + 1;
            setCount(currentCount);
//        }
    }

    private void setCount(int currentCount) {
        count = currentCount;
    }
}
