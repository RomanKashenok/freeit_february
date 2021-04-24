package info.freeit.threads.executors;

import java.util.concurrent.*;

public class ScheduledExecutorExmple {
    public static void main(String[] args) throws InterruptedException, ExecutionException, TimeoutException {

        ExecutorService executor = Executors.newSingleThreadScheduledExecutor();

//        Future<String> task = executor.submit(
//                () -> {
//                    Thread.sleep(7000);
//                    return "HOOOOORAY!!!!";
//                }
//        );
//
//        System.out.println("task not done yet");

        ScheduledFuture<String> task = Executors.newScheduledThreadPool(5).schedule(
                () -> {
                    String threadName = Thread.currentThread().getName();
                    System.out.println("In paralles thread: " + threadName);
                    Thread.sleep(1000);
                    return threadName;
                },
                5,
                TimeUnit.SECONDS);


        System.out.println(task.get() + " returned result!");
    }
}
