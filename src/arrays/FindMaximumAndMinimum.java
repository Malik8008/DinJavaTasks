package arrays;

public class FindMaximumAndMinimum {
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7};
        int maximum = nums[0];
        int minimum = nums[0];
        for (int num : nums) {
            if (num > maximum) {
                maximum = num;
            }
        }
        System.out.println("The maximum number is "+maximum);
        for (int num : nums) {
            if (num < minimum) {
                minimum = num;
            }
        }
        System.out.println("The minimum number is "+minimum);

    }
}
