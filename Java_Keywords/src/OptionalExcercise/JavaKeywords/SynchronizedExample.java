package OptionalExcercise.JavaKeywords;
class SharedResource {
    private int count = 0;

    // Synchronized method to avoid race conditions
    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}

class IncrementThread extends Thread {
    private SharedResource resource;

    public IncrementThread(SharedResource resource) {
        this.resource = resource;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            resource.increment();
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) throws InterruptedException {
        SharedResource resource = new SharedResource();

        // Two threads accessing the shared resource
        Thread thread1 = new IncrementThread(resource);
        Thread thread2 = new IncrementThread(resource);

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
        System.out.println("Synchronized Example: " );
        System.out.println("Final count: " + resource.getCount());
    }
}
