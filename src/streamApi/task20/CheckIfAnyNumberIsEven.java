package streamApi.task20;

import java.util.List;

public class CheckIfAnyNumberIsEven {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,5,6);
        List<Integer> evenNumbers = numbers.stream().filter(i -> i%2==0).toList();
        System.out.println(evenNumbers);
    }
}
