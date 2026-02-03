package streamApi.task26;

import java.util.List;

public class FindFirstElement {
    public static void main(String[] args) {
        List<String> names = List.of("Java","Python","C++");
        String firstElement = names.stream().findFirst().get();
        System.out.println(firstElement);
    }
}
