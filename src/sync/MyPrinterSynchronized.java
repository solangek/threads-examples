package sync;


public class MyPrinterSynchronized {

    public MyPrinterSynchronized() {}

    public synchronized void printName(String name) {
	
		for (int i=1; i<100 ; i++) {

			try {
				// sleep does not release the lock inside a critical section
				// therefore the thread will hold the lock until it finishes
				Thread.sleep((long)(Math.random() * 100));
			} catch (InterruptedException ie) {}

			System.out.print(name);
		}
    }
}


