package javascheduling;

import javascheduling.PrintThread1;

public class ThreadTest1 {
    public static void main(String args[]) {
		PrintThread1 a = new PrintThread1("*");
		PrintThread1 b = new PrintThread1("-");
		PrintThread1 c = new PrintThread1("_");
		a.start();
		b.start();
		c.start();

		// can wait for threads to finish
//		try { a.join(); } catch (InterruptedException e) {}
//		try { b.join(); } catch (InterruptedException e) {}
//		try { c.join(); } catch (InterruptedException e) {}
		System.out.println("ThreadTest1 finished");

    }
}


