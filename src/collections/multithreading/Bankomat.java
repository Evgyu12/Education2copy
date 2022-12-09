package collections.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Victor", lock);
        new Employee("Marina", lock);

    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name=name;
        this.lock=lock;
        this.start();
    }

    public void run(){
        if (lock.tryLock()) {


            try {
//            System.out.println(name + "Gdet ");
//            lock.lock();
                System.out.println(name + " Polzuetsa bankomatom");
                Thread.sleep(2000);
                System.out.println(name + " Zavershil dale");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " ne ho4et gdat v o4eredi");
        }
    }
}
