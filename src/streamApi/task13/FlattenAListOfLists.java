package streamApi.task13;

import java.util.List;

public class FlattenAListOfLists {
    public static void main(String[] args) {
        List<List<String>> list = List.of(
                List.of("A", "B"),
                List.of("C", "D")
        );
        List<String> flat = list.stream()
                .flatMap(List::stream)
                .toList();

        System.out.println(flat);
    }
}
