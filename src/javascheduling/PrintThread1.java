package javascheduling;

public class PrintThread1 extends Thread {
    String name;

    public PrintThread1(String name) {
    	this.name = name;
    }
    public void run() {
    	printName();
    }

    private void printName() {
		for (int i=1; i<50 ; i++) {
			// we can also yield() here
			try {
			sleep((long)(Math.random() * 100));
			} catch (InterruptedException ie) {
				break;
			}

			System.out.print(name);
		}
    }
}



