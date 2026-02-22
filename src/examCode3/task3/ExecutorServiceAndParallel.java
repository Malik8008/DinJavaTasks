package examCode3.task3;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class ExecutorServiceAndParallel {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<Integer>> tasks = IntStream.rangeClosed(1,5)
                .mapToObj(i-> (Callable<Integer>)()->i*i)
                .toList();

        try {
            List<Future<Integer>> futures = executorService.invokeAll(tasks);
            for (Future<Integer> future : futures) {
                System.out.println(future.get());
            }
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }finally {
            executorService.shutdown();
        }
    }
}
