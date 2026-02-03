package streamApi.task9;

import java.util.List;

public class FindMaximumValue {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,50,30);
        int maximum = numbers.stream()
                .max(Integer::compareTo)
                .get();
        System.out.println(maximum);
    }
}
