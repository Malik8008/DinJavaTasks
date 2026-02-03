package streamApi.task19;

import java.util.List;
import java.util.stream.Collectors;

public class FindLengthOfEachString {
    public static void main(String[] args) {
        List<String> words = List.of("java","stream");
        List<Integer> wordsLength = words.stream().map(String::length).collect(Collectors.toList());
        System.out.println(wordsLength);
    }
}
