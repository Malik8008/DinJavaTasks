package streamApi.task6;

import java.util.List;

public class SquareAndSortNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(3,1,4,2);
        List<Integer> result = numbers.stream()
                .map(n -> n * n)
                .sorted()
                .toList();

        System.out.println(result);
    }
}
