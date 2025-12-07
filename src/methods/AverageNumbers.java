package methods;

public class AverageNumbers {
    public static void main(String[] args) {
        System.out.println(average(5,6,7,8,9));
    }

    public static double average(int... numbers){
        double sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum/numbers.length;
    }
}
