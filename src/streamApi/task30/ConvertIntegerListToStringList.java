package streamApi.task30;

import java.util.ArrayList;
import java.util.List;

public class ConvertIntegerListToStringList {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3);
        List<String> strings = new ArrayList<>();
        for (Integer n : numbers) {
            String s = String.valueOf(n);
            strings.add(s);
        }
        System.out.println(strings);
    }
}
