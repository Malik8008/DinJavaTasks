package streamApi.task24;

import java.util.List;

public class SortNumbersDescendingOrder {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4,1,7,2);
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);
    }
}
