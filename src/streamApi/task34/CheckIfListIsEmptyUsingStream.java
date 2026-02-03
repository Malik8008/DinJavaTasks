package streamApi.task34;

import java.util.List;

public class CheckIfListIsEmptyUsingStream {
    public static void main(String[] args) {
        List<String> list = List.of();
        Boolean checkEmpty = list.stream().findAny().isEmpty();
        System.out.println(checkEmpty);

    }
}
