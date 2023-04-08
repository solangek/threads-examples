package sync;

public class PrintThread extends Thread {
    String name;
    MyPrinterSynchronized printer;

    public PrintThread(String name) {
        this.name = name;
    }

    public void setPrinter(MyPrinterSynchronized p) {
        printer = p;
    }

    public void run() {
        printName();
    }

    private void printName() {
        printer.printName(name);
    }
}
