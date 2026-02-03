package streamApi.task21;

import java.util.List;

public class CheckIfAllNumbersArePositive {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3, -1);
        Boolean positiveNumber = numbers.stream().allMatch(i -> i>0);
        System.out.println(positiveNumber);
    }
}
