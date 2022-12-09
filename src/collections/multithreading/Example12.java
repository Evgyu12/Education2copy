package collections.multithreading;

public class Example12 {
    static final Object lock = new Object();

    void mobileCall() {
       synchronized (lock){

           System.out.println("Mobile call Starts");
           try {
               Thread.sleep(3000);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           System.out.println("Mobile call Ends");
       }
   }
     void skypeCall () {
        synchronized (lock) {
            System.out.println("Skype call Starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Skype call Ends");
        }
    }
     void whatsapCall () {
        synchronized (lock) {
            System.out.println(this);
            System.out.println("Whatsap call Starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Whatsap call Ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunndableImplMobile());
        Thread thread2 = new Thread(new RunndableImplSkype());
        Thread thread3 = new Thread(new RunndableImplWhatup());
        thread1.start();
        thread2.start();
        thread3.start();



    }

}

class RunndableImplMobile implements Runnable{
    public void run(){

            new Example12().mobileCall();

    }
}
class RunndableImplSkype implements Runnable {
    public void run() {

        new Example12().skypeCall();

    }
}
class RunndableImplWhatup implements Runnable {
    public void run() {

        new Example12().whatsapCall();

    }
}
