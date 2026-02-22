package examCode3.task4;

import java.util.List;
import java.util.stream.Collectors;

public class EasyTask {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3, 4, 5);
        List<Integer> newNums = nums.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * 2)
                .toList();

        System.out.println(newNums);
    }
}
