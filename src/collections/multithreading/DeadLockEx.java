package collections.multithreading;

public class DeadLockEx {
    public static final Object lock1 = new Object();
    public static final Object lock2 = new Object();

    public static void main(String[] args) {
        Thread10 thread10 = new Thread10();
        Thread20 thread20 = new Thread20();
        thread10.start();
        thread20.start();
    }

}

class Thread10 extends Thread{
    public void run(){
        System.out.println("Thread10: Popitka zahvatit monitor objectiv lock1");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: monitor objectiv lock1 zahva4en");
            System.out.println("Thread10: Popitka zahvatit monitor objectiv lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: monitor objectiv lock1 " + "и lock2 zahva4en");
            }

        }
    }
}
class Thread20 extends Thread{
    public void run(){
        System.out.println("Thread10: Popitka zahvatit monitor objectiv lock2");
        synchronized (DeadLockEx.lock1) {
            System.out.println("Thread10: monitor objectiv lock2 zahva4en");
            System.out.println("Thread10: Popitka zahvatit monitor objectiv lock2");
            synchronized (DeadLockEx.lock2) {
                System.out.println("Thread10: monitor objectiv lock1 " + "и lock2 zahva4en");
            }

        }
    }
}
