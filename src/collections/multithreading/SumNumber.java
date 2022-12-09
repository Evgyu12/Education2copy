package collections.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class SumNumber {
    private static long value = 1_000_000_000_000L;
    private static long sum = 0;

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        List<Future<Long>> futureResult = new ArrayList<>();
        long valueDevidedBy10 = value / 10;
        for (int i = 0; i < 10; i++) {
            long from = valueDevidedBy10 * i + 1;
            long to = valueDevidedBy10 * (i + 1);
            PartialSum task = new PartialSum(from, to);
            Future<Long> longFuture = executorService.submit(task);
            futureResult.add(longFuture);

        }
        for (Future<Long> result:futureResult){
            sum+= result.get();
        }
        System.out.println("Total sum = " + sum);
    }
}

    class PartialSum implements Callable<Long> {
        long from;
        long to;
        long localsum;


        public PartialSum(long from, long to) {
            this.from = from;
            this.to = to;
        }

        public Long call() {
            for (long i = from; i <= to; i++) {
                localsum += i;
            }
            System.out.println("Sum from " + from + " to " + to + " = " + localsum);
            return localsum;
        }
    }


