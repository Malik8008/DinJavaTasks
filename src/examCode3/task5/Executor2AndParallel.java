package examCode3.task5;

import methods.FindFactorial;

import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Executor2AndParallel {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6);

        ExecutorService executorService = Executors.newFixedThreadPool(nums.size());

        List<Callable<Integer>> tasks = nums.stream().map(i -> (Callable<Integer>) ()-> factorial(i)).toList();

        try {
            List<Future<Integer>> futures = executorService.invokeAll(tasks);
            Integer sum = futures.stream().mapToInt(i-> {
                try {
                    return i.get();
                }catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                }
                return 0;
            }).sum();
            System.out.println(sum);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            executorService.shutdown();
        }

    }


    public static Integer factorial(int n) {
        return FindFactorial.factorial(n);
    }
}
