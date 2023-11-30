
public class StaticSynchronization {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                StaticDemo.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                StaticDemo.decrement();
            }
        });

        t1.start();
        t2.start();

        System.out.println("Final count value: " + StaticDemo.getCount());
    }
}

class StaticDemo {
    private static int count = 0;

    public static synchronized void increment() {
        count++;
    }

    public static synchronized void decrement() {
        count--;
    }

    public static synchronized int getCount() {
        return count;
    }
}
