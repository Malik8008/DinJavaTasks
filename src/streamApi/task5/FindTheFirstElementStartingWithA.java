package streamApi.task5;

import java.util.List;

public class FindTheFirstElementStartingWithA {
    public static void main(String[] args) {
        List<String> names = List.of("Bob","Alice","Andrew","Charlie");
        for(String n : names){
            if (n.startsWith("A")){
                System.out.print(n+",");
            }
        }
    }
}
