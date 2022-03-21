package javascheduling;


public class PrintThread2 extends Thread {
    String name;

    public PrintThread2(String name) {

        this.name = name;
    }

    public void run() {

        printName();
    }

    private void printName() {
        for (int i=1; i<50 ; i++) {
            System.out.print(name);
        }
    }
}



