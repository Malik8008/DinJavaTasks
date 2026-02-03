package streamApi.task1;

import java.util.List;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,4,5,6);
        for(int n : numbers){
            if(n%2==0){
                System.out.print(n+",");
            }
        }
    }
}
