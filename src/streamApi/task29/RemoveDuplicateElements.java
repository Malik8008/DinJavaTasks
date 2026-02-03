package streamApi.task29;

import java.util.List;

public class RemoveDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,2,3,3,4);
        List<Integer> noDuplicateNums = numbers.stream().distinct().toList();
        System.out.println(noDuplicateNums);
    }
}
