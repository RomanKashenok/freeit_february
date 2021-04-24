package info.freeit.threads.synchroniation.old;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadsSynchronizationExample {
	
	public static void main(String[] args) throws InterruptedException {

		OjectToSynchronize o = new OjectToSynchronize();

		ExecutorService ex = Executors.newFixedThreadPool(5);
		
		List <Thread> threadList = new ArrayList<>();

		for (int i = 0; i < 5; i++) {
			threadList.add(new Thread(() -> {
				o.doWork();
			}));
		}

		threadList.forEach(Thread::start);

	
		System.out.println("Main finished");
		
	}

}
