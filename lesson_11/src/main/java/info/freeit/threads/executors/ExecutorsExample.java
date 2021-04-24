package info.freeit.threads.executors;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorsExample {
	public static void main(String[] args) throws InterruptedException {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();

		executor.submit(()->{
			String threadName = Thread.currentThread().getName();
			System.out.println(threadName + " started");
			try {
				Thread.sleep(3200);
			} catch (InterruptedException e) {
				System.out.println("********Sleep state had been interrupted!!!");
			}
		});
		
		Thread.sleep(100);
		try {
			System.out.println("Attempt to shut down executor...");
			executor.shutdown();
			executor.awaitTermination(1, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("********Task interrupted");
		}finally {
			if(!executor.isTerminated()) {
				System.out.println("Cancelling not finished tasks...");
			}
			executor.shutdownNow();
			System.out.println("Shutdown finished");
		}
		
		
	}
}
