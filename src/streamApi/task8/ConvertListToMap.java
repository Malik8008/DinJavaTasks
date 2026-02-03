package streamApi.task8;

import java.util.HashMap;
import java.util.List;

public class ConvertListToMap {
    public static void main(String[] args) {
        List<String> words = List.of("apple","banana","kiwi");
        HashMap<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, word.length());
            System.out.println(word + " : " + map.get(word));
        }
    }
}
