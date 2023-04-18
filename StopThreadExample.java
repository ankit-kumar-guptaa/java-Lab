//Q.20
public class StopThreadExample implements Runnable {
    private volatile boolean running = true; // Volatile flag to indicate if thread should keep running

    @Override
    public void run() {
        System.out.println("Thread is running. Press Ctrl+C to stop.");

        while (running) {
            // Keep running until the running flag is set to false
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Thread has stopped.");
    }

    public void stop() {
        running = false; // Set the running flag to false to stop the thread
    }

    public static void main(String[] args) {
        System.out.println("===========Code by Ankit Kumar Gupta 20/383==================");
        System.out.println("Main thread is starting.");

        // Create and start a thread
        Thread thread = new Thread(new StopThreadExample());
        thread.start();

        // Wait for thread to finish
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}
