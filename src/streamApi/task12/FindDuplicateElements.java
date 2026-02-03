package streamApi.task12;

import java.util.List;
//tapa bilmedim
public class FindDuplicateElements {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,4,3,5);
        List<Integer> duplicateNums = numbers.stream().distinct().toList();
    }
}
