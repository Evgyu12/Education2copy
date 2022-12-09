package collections.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callbox = new Semaphore(2);
        new Person("zaur", callbox);
        new Person("Ivan", callbox);
        new Person("Elena", callbox);
        new Person("Oleg", callbox);



    }
}

class Person extends Thread {
    String name;
    private Semaphore callbox;

    public Person (String name, Semaphore callbox){
        this.name=name;
        this.callbox=callbox;
        this.start();
    }
    public void run(){

        try {
            System.out.println(name + " Gdet... ");
            callbox.acquire();
            System.out.println(name + " Polzuetc telefonom");
            sleep(2000);
            System.out.println(name + " Zaverhil zvonok");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            callbox.release();
        }
    }
}
