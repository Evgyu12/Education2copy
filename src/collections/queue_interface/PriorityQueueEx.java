package collections.queue_interface;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue <Integer> pr = new PriorityQueue<>();
        pr.add(4);
        pr.add(1);
        pr.add(7);
        pr.add(10);
        pr.add(8);
        // 1 4 7 8 10

        System.out.println(pr.peek());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
        System.out.println(pr.remove());
    }
}
