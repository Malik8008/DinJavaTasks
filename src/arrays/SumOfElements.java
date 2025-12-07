package arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] nums = {10,20,30,40};
        int sum=0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
