public class MultipleThread implements Runnable {
    private String threadName;

    public MultipleThread(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " is running.");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread " + threadName + ": " + i);
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Thread " + threadName + " has finished.");
    }

    public static void main(String[] args) {
        System.out.println("==========Code BY Navneet Kumar 20/1362============");
        System.out.println("Main thread is starting.");

        // Create and start two threads
        Thread thread1 = new Thread(new MultipleThread("Thread 1"));
        Thread thread2 = new Thread(new MultipleThread("Thread 2"));
        thread1.start();
        thread2.start();

        // Wait for threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main thread has finished.");
    }
}
