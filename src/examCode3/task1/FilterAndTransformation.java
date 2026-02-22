package examCode3.task1;

import java.util.Comparator;
import java.util.List;
public class FilterAndTransformation {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 10, 15, 20, 7, 8);
        List<Integer> newNumsList = nums.stream()
                .filter(x -> x % 2 == 1)
                .map(x -> x * 3)
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println(newNumsList);
    }
}
