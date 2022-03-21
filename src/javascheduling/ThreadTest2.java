package javascheduling;

public class ThreadTest2 {

    public static void main(String args[]) {

		PrintThread2 a = new PrintThread2("*");
		PrintThread2 b = new PrintThread2("-");
		PrintThread2 c = new PrintThread2("_");

		a.start();
		b.start();
		c.start();
		// wait for all threads to finish
		try {
			a.join();
			b.join();
			c.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			System.out.println("All threads finished");
		}
    }
}



