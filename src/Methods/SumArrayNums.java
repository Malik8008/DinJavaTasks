package Methods;

public class SumArrayNums {
    public static void main(String[] args) {
        int[] numbers = {10,20,30,40};
        System.out.println(sumArray(numbers));
    }

    public static int sumArray(int[] n){
        int sum = 0;
        for(int num : n){
            sum+=num;
        }
        return sum;
    }
}
