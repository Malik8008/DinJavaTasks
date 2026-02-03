package streamApi.task25;

import java.util.List;

public class FindMinimumNumber {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(9,3,6);
        Integer minimumNumber = numbers.stream().min(Integer::compareTo).get();
        System.out.println(minimumNumber);
    }
}
