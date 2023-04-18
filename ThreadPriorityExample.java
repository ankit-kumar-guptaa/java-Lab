public class ThreadPriorityExample {
    public static class MyThread extends Thread {
        private String name;

        public MyThread(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println(name + ": " + i);
                try {
                    Thread.sleep(1000); // Sleep for 1 second
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("===========Code by Ankit Kumar Gupta 20/383==================");
        MyThread thread1 = new MyThread("Thread 1");
        MyThread thread2 = new MyThread("Thread 2");

        thread1.setPriority(Thread.MAX_PRIORITY); // Set thread1 to highest priority
        thread2.setPriority(Thread.MIN_PRIORITY); // Set thread2 to lowest priority

        thread1.start();
        thread2.start();
    }
}
