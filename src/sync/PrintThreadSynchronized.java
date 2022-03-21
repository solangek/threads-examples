package sync;

public class PrintThreadSynchronized extends Thread{
    String name;
    MyPrinter printer;

    public PrintThreadSynchronized(String name) {

        this.name = name;
    }

    public void setPrinter(MyPrinter p) {

        printer = p;
    }

    public void run() {

        printName();
    }

    private void printName() {

        printer.printName(name);
    }
}
