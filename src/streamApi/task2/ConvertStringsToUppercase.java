package streamApi.task2;

import java.util.List;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        List<String> names = List.of("java","stream","api");
        for(String n : names){
            System.out.print(n.toUpperCase()+",");
        }
    }
}
