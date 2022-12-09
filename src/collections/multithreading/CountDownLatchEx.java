package collections.multithreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);

    private static void marketStuffIsOnPlace () throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market Stuff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }
    private static void evrythingsIsReady () throws InterruptedException {
        Thread.sleep(3000);
        System.out.println("Evrythings is ready, so let open market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }
    private static void openMarket () throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is open");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());

    }


    public static void main(String[] args) throws InterruptedException {
        new Friends("Zaur", countDownLatch);
        new Friends("Oleg", countDownLatch);
        new Friends("Elena", countDownLatch);
        new Friends("Victor", countDownLatch);
        new Friends("Maryna", countDownLatch);
        marketStuffIsOnPlace();
        evrythingsIsReady();
        openMarket();

    }
}
class Friends extends Thread {
    String name;
    private CountDownLatch countDownLatch;
    public Friends (String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch=countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " Drug pristupil k zakupkam");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
