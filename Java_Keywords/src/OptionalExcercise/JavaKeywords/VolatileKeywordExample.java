package OptionalExcercise.JavaKeywords;
class VolatileExample extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            // Thread keeps running while the flag is true
        }
        System.out.println("Thread terminated.");
    }

    public void stopRunning() {
        running = false; // Update running flag
    }
}

public class VolatileKeywordExample {
    public static void main(String[] args) throws InterruptedException {
        VolatileExample thread = new VolatileExample();
        thread.start();
System.out.println("Volatile Keyword Example");
        Thread.sleep(1000); // Main thread sleeps for 1 second
        thread.stopRunning(); // Stop the running thread
    }
}
