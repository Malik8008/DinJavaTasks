package arrays;

public class CountEvenAndOddNumbers {
    public static void main(String[] args) {
        int[] nums = {3, 4, 6, 7, 9, 12};
        int evenCount = 0;
        int oddCount = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Even: "+evenCount);

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                oddCount++;
            }
        }
        System.out.println("Odd: "+oddCount);
    }
}
