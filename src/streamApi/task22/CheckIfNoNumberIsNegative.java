package streamApi.task22;

import java.util.List;

public class CheckIfNoNumberIsNegative {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        Boolean positiveNumber = numbers.stream().allMatch(i -> i>0);
        System.out.println(positiveNumber);
    }
}
