/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrupt;

/**
 * a class that creates a thread that and possibly interrupts it
 * before it finishes
 * @author solangekarsenty
 */
public class InterruptMessageLoop {

    static final int DEFAULT_PATIENCE = 10;

    public static void main(String[] args) throws InterruptedException {

        // Delay, in milliseconds before we interrupt MessageLoop
        long patience = 1000 * 3;

        // If command line argument present, gives patience in seconds.
        if (args.length > 0) {
            try {
                patience = Long.parseLong(args[0]) * 1000;
            } catch (NumberFormatException e) {
                patience = DEFAULT_PATIENCE;
                System.err.println("Using default patience of " + patience + " ms");
            }
        }

        // print a message, notice that current thread is not MessageLoop
        // but the thread that called MessageLoop (the main thread)
        MessageLoop.threadMessage("Starting MessageLoop thread");

        // record start time to compute elapsed time
        long startTime = System.currentTimeMillis();

        //  create a new thread that runs MessageLoop
        Thread t = new Thread(new MessageLoop());
        // start the thread
        t.start();

        MessageLoop.threadMessage("Waiting for MessageLoop thread to finish");

        // loop until MessageLoop thread exits
        while (t.isAlive()) {
            MessageLoop.threadMessage("Still waiting...");
            // Wait maximum of 1 second for MessageLoop thread to finish.
            t.join(1000);
            // If MessageLoop thread still alive after "patience" ms, interrupt it.
            if (((System.currentTimeMillis() - startTime) > patience) && t.isAlive()) {
                MessageLoop.threadMessage("Tired of waiting!");
                t.interrupt();
                // Wait for MessageLoop thread to finish.
                t.join();
            }
        }
        MessageLoop.threadMessage("MessageLoop terminated!");
    }
    
}
