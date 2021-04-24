package info.freeit.threads.synchroniation.old;

public class Counter {

    public volatile int count = 0;

    public void increment() {
        int currentCount = count;
        currentCount = currentCount + 1;
        setCount(currentCount);
    }

    private void setCount(int currentCount) {
        count = currentCount;
    }
}