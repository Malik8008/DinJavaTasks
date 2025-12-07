package practiceCode;

public class MaxSecondNumber {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;
        int[] arr = {5, 10, 12, 6, 3};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                maxSecond=max;
                max = arr[i];
            }
            else if(arr[i]>maxSecond && arr[i]<max) {
                break;
            }
        }
        System.out.println(maxSecond);
    }
}
