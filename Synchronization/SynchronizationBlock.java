
public class SynchronizedBlock {
    public static void main(String[] args) {
        SyncDemo s = new SyncDemo();
        Thread t1 = new Thread(() ->{
            for (int i = 0; i< 10; i++){
                s.countInc();
            }
        });
        t1.start();
        System.out.println(" count value: " + s.count);
    }
}

class SyncDemo{
    public int  count;

    public void countInc(){
        synchronized (this){
            count++;
        };
    }
}
