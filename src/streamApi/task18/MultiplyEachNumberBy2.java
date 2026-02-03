package streamApi.task18;

import java.util.List;

public class MultiplyEachNumberBy2 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        List<Integer> multiplications = numbers.stream()
                .map(i -> i*2)
                .toList();
        System.out.println(multiplications);
    }
}
