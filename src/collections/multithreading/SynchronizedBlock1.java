package collections.multithreading;

public class SynchronizedBlock1 {
    public static void main(String[] args) {
        MyRunndableImpl2 runndableImpl1 = new MyRunndableImpl2();
        Thread thread1 = new Thread(runndableImpl1);
        Thread thread2 = new Thread(runndableImpl1);
        Thread thread3 = new Thread(runndableImpl1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter2{
    static int count = 0;
}

class MyRunndableImpl2 implements Runnable{
    public void doWork1() {
        synchronized (this) {
            Counter2.count++;
            System.out.println(Counter2.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i<3;i++){
            doWork1();
        }

    }
}

