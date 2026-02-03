package streamApi.task33;

import java.util.List;

public class CountTotalElements {
    public static void main(String[] args) {
        List<String> items = List.of("pen","pencil","eraser");
        int countItems = items.size();
        System.out.println(countItems);
    }

}
