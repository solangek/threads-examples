package stopping;

import java.util.concurrent.atomic.AtomicBoolean;

public class RunnerWithFlag extends Thread {
    String name;

    private AtomicBoolean keepRunning = new AtomicBoolean(true);

    public RunnerWithFlag(String name) {
    	this.name = name;
    }

    public void run() {
		int i;
		for (i=1; i<100 ; i++) {
			try {
				sleep((long)(Math.random() * 100));
			} catch (InterruptedException ie) {
				System.out.println("thread sleep " + name + " interrupted");
			}
			System.out.print(name);
			if (!keepRunning.get())
				break;
		}
		System.out.println("Thread " + name + " has ended at index " + i);
    }


    public void setKeepRunning(boolean r) {
		keepRunning.set(false);
	}
}





