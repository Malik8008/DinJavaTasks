package streamApi.task17;

import java.util.List;

public class FilterNumbersGreaterThan5 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,4,6,8,2);
        List<Integer> numbersGreaterThan5 = numbers.stream().filter(n -> n > 5).toList();
        System.out.println(numbersGreaterThan5);
    }
}
