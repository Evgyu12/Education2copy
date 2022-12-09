package collections.multithreading;

public class SynhronizedBlock2 {
    volatile static int counter = 0;
    public static void increment () {
        synchronized (SynhronizedBlock2.class) {
            counter++;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new R());
        Thread thread2 = new Thread(new R());
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();


        System.out.println(counter);
    }

}
class R2 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i<100;i++){
            Example11.increment();
        }
    }
}