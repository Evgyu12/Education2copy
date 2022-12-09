package collections.multithreading;

public class VolatileEx extends Thread{
    volatile boolean b= true;

    public void run (){
        long counter = 0;
        while (b){
            counter++;
        }
        System.out.println("Loop is finish. counter = " + counter);
    }
    public static void main(String[] args) throws InterruptedException {
        VolatileEx thread = new VolatileEx();
        thread.start();
        thread.sleep(3000);
        System.out.println("After 3 seconds time to wake up");
        thread.b=false;
        thread.join();
        System.out.println("End of programm");
    }
}
