package sync;

// thread using a synchronized Printer class
public class ThreadTestSynchronized {

    public static void main(String args[]) {

        // the object on which threads will synchronize
        MyPrinterSynchronized myPrinter = new MyPrinterSynchronized();

        PrintThread a = new PrintThread("*");
        PrintThread b = new PrintThread("-");
        PrintThread c = new PrintThread("_");

        // pass the shared object to the threads
        a.setPrinter(myPrinter);
        b.setPrinter(myPrinter);
        c.setPrinter(myPrinter);

        System.out.println();

        // start the threads
        a.start();
        b.start();
        c.start();

        System.out.println("ThreadTest3 finished");
    }

}
