package stopping;

public class StopRunnerWithFlag {
    public static void main(String args[]) {
        RunnerWithFlag a = new RunnerWithFlag("*");
        RunnerWithFlag b = new RunnerWithFlag("-");
        RunnerWithFlag c = new RunnerWithFlag("#");
        a.start();
        b.start();
        c.start();

        sleepSome();
        // stop a
        a.setKeepRunning(false);

        sleepSome();
        // stop b
        b.setKeepRunning(false);

        sleepSome();
        // stop c
        c.setKeepRunning(false);
    }

    private static void sleepSome() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ie) {}
    }
}
