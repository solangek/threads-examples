package sync;

// thread using a synchronized Printer class
public class ThreadTestSynchronized {

    public static void main(String args[]) {

        MyPrinter myPrinter = new MyPrinter();

        PrintThreadSynchronized a = new PrintThreadSynchronized("*");
        PrintThreadSynchronized b = new PrintThreadSynchronized("-");
        PrintThreadSynchronized c = new PrintThreadSynchronized("_");

        a.setPrinter(myPrinter);
        b.setPrinter(myPrinter);
        c.setPrinter(myPrinter);

        System.out.println();

        a.start();
        b.start();
        c.start();
        System.out.println("ThreadTest3 finished");
    }

}
