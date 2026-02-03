package streamApi.task3;

import java.util.List;

public class CountElementsGreaterThan10 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(5,10,15,20);
        for(int n : nums){
            if(n>10){
                System.out.print(n+",");
            }
        }
    }
}
