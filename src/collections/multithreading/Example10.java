package collections.multithreading;

public class Example10 {
    public static void main(String[] args) {
        MyRunndableImpl1 runndableImpl1 = new MyRunndableImpl1();
        Thread thread1 = new Thread(runndableImpl1);
        Thread thread2 = new Thread(runndableImpl1);
        Thread thread3 = new Thread(runndableImpl1);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
class Counter{
    static int count = 0;
}

class MyRunndableImpl1 implements Runnable{
    public synchronized void increment(){
        Counter.count++;
        System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        for (int i = 0; i<3;i++){
            increment();
        }

    }
}
