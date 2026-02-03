package streamApi.task32;

import java.util.List;

public class FindSumOfAllNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4);
        Integer sumNumbers = numbers.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sumNumbers);
    }
}
