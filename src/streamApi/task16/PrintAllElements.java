package streamApi.task16;

import java.util.List;


public class PrintAllElements {
    public static void main(String[] args) {
        List<String> names = List.of("A", "B", "C");
        names.forEach(System.out::println);
    }
}
