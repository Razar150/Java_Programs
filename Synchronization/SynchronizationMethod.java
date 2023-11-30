
public class SynchronizationMethod {

    public static void main(String[] args) {
        Counte c1 = new Counte();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c1.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                c1.decrement();
            }
        });

        t1.start();
        t2.start();

        System.out.println("Final count value: " + c1.count);
    }
}

class Counte{
    public int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }
}
