package streamApi.task28;

import java.util.List;
import java.util.stream.Collectors;

public class LimitToFirst3Elements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(10,20,30,40,50);
        List<Integer> limitedNumbers = numbers.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedNumbers);
    }
}
