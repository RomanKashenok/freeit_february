package info.freeit.threads.deadlock;

public class ImPoliceman {

    public synchronized void checkHuman(ImPoliceman obj) {
        try {
            System.out.println("From class ObjectOb checkHuman method. Thread: " + Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }
        obj.checkChecker(this);
    }

    public synchronized void checkChecker(ImPoliceman obj) {
        System.out.println("From class ObjectA checkChecker method");
    }
}





































