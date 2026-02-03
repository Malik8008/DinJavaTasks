package streamApi.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class RemoveNullValues {
    public static void main(String[] args) {
        List<String> data = new ArrayList<>(Arrays.asList("A", null, "B", null, "C"));
        data.removeIf(Objects::isNull);
        System.out.println(data);
    }
}
