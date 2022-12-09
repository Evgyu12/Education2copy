package collections.thread.safe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList<Integer> sourse = new ArrayList<>();
        for (int i=0;i<5;i++){
            sourse.add(i);
        }
//        ArrayList <Integer> target = new ArrayList<>();
        List<Integer> syncList =
                Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () ->{syncList.addAll(sourse);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(syncList);
    }
}
