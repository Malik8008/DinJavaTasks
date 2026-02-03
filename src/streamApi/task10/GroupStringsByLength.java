package streamApi.task10;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsByLength {
    public static void main(String[] args) {
        List<String> words = List.of("a", "bb", "ccc", "dd");
        Map<Integer, List<String>> groupingString = words.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupingString);
    }
}
