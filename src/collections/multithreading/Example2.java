package collections.multithreading;

public class Example2 {
    public static void main(String[] args) {
        myThread1 myThread1 = new myThread1();
        myThread2 myThread2 = new myThread2();
        myThread1.start();
        myThread2.start();
    }
}
class myThread1 extends Thread{
    public void run(){
        for (int i = 1; i<=1000;i++){
            System.out.println(i);
        }
    }
}
class myThread2 extends Thread{
    public void run(){
        for (int i = 1000; i>0;i--){
            System.out.println(i);
        }
    }
}
