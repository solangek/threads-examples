/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interrupt;

/**
 * a class that implements a thread that prints messages from
 * a queue (a simple array)
 */
public class MessageLoop implements Runnable {

    /**
     * Prints a message to the console with the name of the current running thread
     * @param message
     */
    public static void threadMessage(String message) {
        String threadName = Thread.currentThread().getName();
        System.out.format("%s: %s%n",threadName, message);
    }

    /**
     * The message queue:
     * Loop through the queue and print each message
     */
    public void run() {
            String importantInfo[] = {
                "Mares eat oats",
                "Does eat oats",
                "Little lambs eat ivy",
                "A kid will eat ivy too"
            };
            try {
                // print out messages from the queue
                for (int i = 0;i < importantInfo.length; i++) {
                    // sleep in order to simulate a message being sent and allow the thread to be interrupted
                    Thread.sleep(4000);
                    // Print the message
                    threadMessage(importantInfo[i]);
                }
            } catch (InterruptedException e) {
                // Print a message to indicate the thread was interrupted
                threadMessage("I wasn't done but sleep got interrupted!");
            }
        }
}
