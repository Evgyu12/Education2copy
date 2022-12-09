package collections.multithreading;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        interruptedThread.sleep(2000);
        interruptedThread.interrupt();


        interruptedThread.join();
        System.out.println("Main ends");

    }
}



class InterruptedThread extends Thread{
    double sqrtSum = 0;
    public void run(){
        for (int i = 1; i<=100000000;i++){
           if(isInterrupted()){
               System.out.println("Potok hotyat prervat");
               System.out.println("Vce norm potok prervali");
               System.out.println(sqrtSum);
               return;
           }
            sqrtSum+=Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.out.println("Potok hotyat prervat vo vremya sna, zaverhim ego raboty");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}